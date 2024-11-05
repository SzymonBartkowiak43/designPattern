package org.example.zajecia.zadanie4;

class Point {
    // Współrzędne punktu
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Gettery do pobierania wartości współrzędnych
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}