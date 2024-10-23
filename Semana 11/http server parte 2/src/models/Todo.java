package models;

import java.util.UUID;

public class Todo {
    private UUID id;
    private String title;
    private boolean completed;

    public Todo(String id, String title, boolean completed) {
        this.id = id.isEmpty() ? UUID.randomUUID() : UUID.fromString(id);
        this.title = title;
        this.completed = completed;
    }
    public UUID getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isCompleted() {
        return completed;
    }
}
