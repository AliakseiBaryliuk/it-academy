package by.itacademy.brest.revision.task.model.developer;

import by.itacademy.brest.revision.task.model.Task;
import by.itacademy.brest.revision.task.model.Unit;

public interface Developer {
    void develop();
    Unit getUnit();
    void setTask(Task task);
    Task getTask();
}
