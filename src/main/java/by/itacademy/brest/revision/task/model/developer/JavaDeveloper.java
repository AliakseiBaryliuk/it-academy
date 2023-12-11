package by.itacademy.brest.revision.task.model.developer;

import by.itacademy.brest.revision.task.exception.TaskException;
import by.itacademy.brest.revision.task.model.Task;
import by.itacademy.brest.revision.task.model.TaskStatus;
import by.itacademy.brest.revision.task.model.Title;
import by.itacademy.brest.revision.task.model.Unit;
import by.itacademy.brest.revision.task.model.User;

public class JavaDeveloper extends User implements Developer {
    private Task task;

    public JavaDeveloper(String name) {
        super(name, Title.DEVELOPER);
    }

    @Override
    public void develop() {
        if (task != null) {
            task.setStatus(TaskStatus.IN_PROGRESS);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            task.setStatus(TaskStatus.DONE);
            System.out.println("Java task is finished. Task id = " + task.getId() + " Status = " + task.getStatus());
        } else {
            throw new TaskException("Task is null");
        }
    }

    @Override
    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTask() {
        return task;
    }

    @Override
    public Unit getUnit() {
        return Unit.JAVA;
    }
}
