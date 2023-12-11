package by.itacademy.brest.revision.task.model;

import java.util.Objects;
import java.util.UUID;

public class Task {
    private String id;
    private String content;
    private TaskStatus status;
    private String path;

    public Task(String path, String content) {
        this.id = UUID.randomUUID().toString();
        this.path = path;
        this.content = content;
        this.status = TaskStatus.CREATED;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(content, task.content) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, status);
    }
}
