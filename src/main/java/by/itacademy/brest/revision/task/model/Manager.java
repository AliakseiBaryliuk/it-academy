package by.itacademy.brest.revision.task.model;

import by.itacademy.brest.revision.task.exception.TaskException;
import by.itacademy.brest.revision.task.exception.UserException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Manager extends User {
    private Unit unit;
    private List<String> developers;
    private List<Task> tasks;

    public Manager(String name, Unit unit) {
        super(name, Title.MANAGER);
        this.unit = unit;
        developers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public List<String> getDevelopers() {
        return developers;
    }

    public Unit getUnit() {
        return unit;
    }

    public void addDeveloper(String developerId) {
        if (developers.contains(developerId)) {
            throw new UserException("This user is in the unit");
        } else {
            developers.add(developerId);
        }
    }

    public Task addTask(String path) {
        Task newTask = new Task(path, loadContent(path));
        addToTasks(path, newTask);
        return newTask;
    }

    private void addToTasks(String path, Task newTask) {
        tasks.stream()
                .filter(task -> Objects.equals(task.getPath(), path))
                .findAny().ifPresentOrElse(task -> {
                    throw new TaskException("Task is present for such path");
                }, () -> tasks.add(newTask));
    }

    private String loadContent(String path) {
        try (Stream<String> stringStream = Files.lines(Paths.get(path))) {
            return stringStream.collect(Collectors.joining());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
