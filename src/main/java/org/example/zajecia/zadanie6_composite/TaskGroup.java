package org.example.zajecia.zadanie6_composite;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class TaskGroup {
    @Getter
    protected String name;
    protected List<ITaskComposite> list = new ArrayList<>();

    public TaskGroup(String name) {
        this.name = name;
    }

    public void addTask(ITaskComposite task) {
        list.add(task);
    }


    public LocalDate getStartDate() {
        return list.stream()
                .map(ITaskComposite::getStartDate)
                .min(LocalDate::compareTo)
                .orElse(null);
    }


    public LocalDate getEndDate() {
        return list.stream()
                .map(ITaskComposite::getEndDate)
                .max(LocalDate::compareTo)
                .orElse(null);
    }


    public boolean isLate() {
        return list.stream()
                .anyMatch(ITaskComposite::isLate);
    }

    public void markAsCompleted(LocalDate completionDate) {
        list.stream()
                .forEach(task -> {
                    if(task.isCompleted()) {
                        task.markAsCompleted(completionDate);
                    }
                });
    }

    public boolean isCompleted() {
        return list.stream()
                .allMatch(ITaskComposite::isCompleted);
    }

    public String getStatus() {
        return isCompleted() ? "[Completed]" : "[Pending]";
    }


    public void display(String indent) {
        System.out.println(indent + name + " - Status: " + getStatus());
        for (ITaskComposite component : list) {
            component.display(indent + "----");
        }
    }

    public Long getCompletedOnTime() {
        return list.stream()
                .filter(task -> task.isCompleted() && !task.isLate())
                .count();
    }

    public Long getCompletedLate() {
        return list.stream()
                .filter(task -> task.isCompleted() && task.isLate())
                .count();
    }

    public Long getPending() {
        return list.stream()
                .filter(task -> !task.isCompleted())
                .count();
    }

    public Long getPendingLate() {
        return list.stream()
                .filter(task -> !task.isCompleted() && LocalDate.now().isAfter(task.getEndDate()))
                .count();
    }
}
