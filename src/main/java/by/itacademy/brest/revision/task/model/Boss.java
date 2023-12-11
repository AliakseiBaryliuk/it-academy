package by.itacademy.brest.revision.task.model;

import by.itacademy.brest.revision.task.exception.TaskException;
import by.itacademy.brest.revision.task.exception.UserException;
import by.itacademy.brest.revision.task.model.developer.Developer;

import java.util.ArrayList;
import java.util.List;

public class Boss extends User {
    private List<String> managers;
    private Company company;
    private List<String> tasks;

    public Boss(String name) {
        super(name, Title.BOSS);
        managers = new ArrayList<>();
        company = new Company();
        company.addUser(this);
        tasks = new ArrayList<>();
        tasks.addAll(List.of("JAVA_task1.txt", "KOTLIN_task1.txt"));
    }

    public List<String> getManagers() {
        return managers;
    }

    public Company getCompany() {
        return company;
    }

    public void addUsers(List<User> users) {
        users.forEach(this::addUser);
    }

    public void addUser(User user) {
        if (user.getTitle() == Title.MANAGER && !managers.contains(user.getId())) {
            managers.add(user.getId());
        } else if (user.getTitle() == Title.DEVELOPER) {
            addDeveloper(user, company.getUsers());
        }
        company.addUser(user);
    }

    private void addDeveloper(User user, List<User> users) {
        users.stream()
                .filter(u -> u.getTitle() == Title.MANAGER && ((Manager) u).getUnit() == ((Developer) user).getUnit())
                .findFirst()
                .ifPresentOrElse(manager -> ((Manager) manager).addDeveloper(user.getId()),
                        () -> {
                            throw new UserException("No manager");
                        });
    }

    public void assignTasks() {
        tasks.forEach(this::addTask);
    }

    private void addTask(String path) {
        try {
            Unit unit = Unit.valueOf(path.split("_")[0]);
            assignManager(path, unit);

        } catch (IllegalArgumentException ex) {
            throw new TaskException("There is no such unit");
        }
    }

    private void assignManager(String path, Unit unit) {
        company.getUsersByIds(managers).stream()
                .map(Manager.class::cast)
                .filter(manager -> manager.getUnit() == unit)
                .findFirst()
                .ifPresentOrElse(manager -> assignDeveloper(path, manager), () -> {
                    throw new UserException("There is no manager for this task");
                });
    }

    private void assignDeveloper(String path, Manager manager) {
        company.getUsersByIds(manager.getDevelopers()).stream()
                .map(Developer.class::cast)
                .findFirst()
                .ifPresentOrElse(developer -> developer.setTask(manager.addTask(path)), () -> {
                    throw new UserException("There is no developer for this task");
                });
    }

}
