package org.example.zajecia.zadanie6_composite;

import lombok.Getter;

import java.time.LocalDate;

class Task implements ITaskComponent {
    @Getter
    private final String name;
    @Getter
    private final LocalDate startDate;
    @Getter
    private final LocalDate endDate;
    private boolean isCompleted = false;
    private boolean isLate = false;

    public Task(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void markAsCompleted(LocalDate completionDate) {
        isCompleted = true;
        isLate = completionDate.isAfter(endDate);
    }

    public String getStatus() {
        if (isCompleted) {
            return isLate ? "[Completed Late]" : "[Completed]";
        }
        return "[Pending]";
    }

    @Override
    public String toString() {
        return name + " (" + startDate + " to " + endDate + ") - Status: " + getStatus();
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public boolean isLate() {
        return isLate;
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + startDate + " to " + endDate + ") - Status: " + getStatus());
    }
}
