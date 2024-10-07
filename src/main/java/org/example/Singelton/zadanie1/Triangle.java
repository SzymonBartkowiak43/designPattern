package org.example.Singelton.zadanie1;

class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c; }

    public double getPerimeter() {
        return a + b + c; }

    public double getArea() {
        return a * b * c; }
}