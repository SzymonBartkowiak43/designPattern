package org.example.Factory.pro;

abstract class Cell implements Cloneable {
    public abstract Cell clone();
    public abstract void setValue(Object value);
    public abstract String toString();
}

