package org.example.Factory;

public class BooleanCell extends Cell{
    private boolean bool;
    public BooleanCell(boolean value) {
        super(Boolean.toString(value));
        bool = value;
    }
}
