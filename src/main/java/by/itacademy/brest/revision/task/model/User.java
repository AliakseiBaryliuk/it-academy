package by.itacademy.brest.revision.task.model;

import java.util.UUID;

public abstract class User {
    private String id;
    private String name;
    private Title title;

    public User(String name, Title title) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
