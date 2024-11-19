package org.example.zajecia.zadanie6_composite;



public class NormalTaskGroup extends TaskGroup implements ITaskComposite {

    public NormalTaskGroup(String name) {
        super(name);
    }

    @Override
    public boolean isCompleted() {
        return list.stream()
                .allMatch(ITaskComposite::isCompleted);
    }

    @Override
    public String getStatus() {
        return isCompleted() ? "[Completed]" : "[Pending]";
    }


}
