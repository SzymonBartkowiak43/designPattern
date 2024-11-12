package org.example.zajecia.zadanie6_composite;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;


public class OptionalTaskGroup extends TaskGroup implements ITaskComponent{


    public OptionalTaskGroup(String name) {
        super(name);
    }


    @Override
    public boolean isCompleted() {
        return list.stream()
                .anyMatch(ITaskComponent::isCompleted);
    }


    @Override
    public void markAsCompleted(LocalDate completionDate) {
        if (isCompleted()) {
            return;
        }
        Random random = new Random();
        List<ITaskComponent> incompleteTasks = list.stream()
                .filter(task -> !task.isCompleted())
                .toList();
        if (!incompleteTasks.isEmpty()) {
            ITaskComponent randomTask = incompleteTasks.get(random.nextInt(incompleteTasks.size()));
            randomTask.markAsCompleted(completionDate);
        }
    }

}
