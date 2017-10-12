package ru.itpark;

import static java.lang.Math.PI;

class Circle extends Shape {

    public String toString() {
        return("Circle");
    }

    int radius;

    Circle (int radius) {
        this.radius = radius;
    }

    double measure() {
        return ((radius * radius) * PI);
    }
}
