package org.example.zajecia.zadanie6_composite;



public class NormalTaskGroup extends TaskGroup implements ITaskComponent{

    public NormalTaskGroup(String name) {
        super(name);
    }

    @Override
    public boolean isCompleted() {
        return list.stream()
                .allMatch(ITaskComponent::isCompleted);
    }

    @Override
    public String getStatus() {
        return isCompleted() ? "[Completed]" : "[Pending]";
    }


    @Override
    public void display(String indent) {
        System.out.println(indent + name + " - Status: " + getStatus());
        for (ITaskComponent component : list) {
            component.display(indent + "----");
        }
    }

}
