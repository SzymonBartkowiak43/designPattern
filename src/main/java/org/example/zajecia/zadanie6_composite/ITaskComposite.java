package org.example.zajecia.zadanie6_composite;

import java.time.LocalDate;

public interface ITaskComposite {
    String getName();
    LocalDate getStartDate();
    LocalDate getEndDate();
    boolean isCompleted() ;
    boolean isLate();
    void markAsCompleted(LocalDate completionDate);
    String getStatus();
    void display(String indent);
}
