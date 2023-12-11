package by.itacademy.brest.revision.task;

import by.itacademy.brest.revision.task.model.Boss;
import by.itacademy.brest.revision.task.model.Company;
import by.itacademy.brest.revision.task.model.Manager;
import by.itacademy.brest.revision.task.model.Unit;
import by.itacademy.brest.revision.task.model.User;
import by.itacademy.brest.revision.task.model.developer.Developer;
import by.itacademy.brest.revision.task.model.developer.JavaDeveloper;
import by.itacademy.brest.revision.task.model.developer.KotlinDeveloper;

import java.util.List;

public class TestRevision {
    public static void main(String[] args) throws InterruptedException {
        Boss boss = new Boss("Super boss");
        Company company = boss.getCompany();
        User javaManager = new Manager("Vasya", Unit.JAVA);
        User kotlinManager = new Manager("Masha", Unit.KOTLIN);

        User javaDeveloper = new JavaDeveloper("Max");
        User kotlinDeveloper = new KotlinDeveloper("Kostya");

        boss.addUsers(List.of(javaManager, javaDeveloper, kotlinManager, kotlinDeveloper));

        boss.assignTasks();

        boss.getManagers()
                .forEach(manager -> {
                    Thread task = new Thread(() -> {
                        startTask(company, manager);
                        System.out.println("Thread: " + Thread.currentThread().getName());
                    });
                    task.start();
                });
    }

    public static void startTask(Company company, String manager) {
        List<String> developers = ((Manager) company.getUserById(manager)).getDevelopers();

        company.getUsersByIds(developers).stream()
                .map(Developer.class::cast)
                .filter(developer -> developer.getTask() != null)
                .forEach(Developer::develop);
    }
}
