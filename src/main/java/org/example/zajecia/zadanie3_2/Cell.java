package org.example.zajecia.zadanie3_2;

abstract class Cell implements Cloneable {
    public abstract Cell clone();
    public abstract void setValue(Object value);
    public abstract String toString();
}

