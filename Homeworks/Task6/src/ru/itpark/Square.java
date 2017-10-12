package ru.itpark;

import static java.lang.Math.pow;

class Square extends Shape {

    public String toString() {
        return("Square");
    }

    int side;

    Square (int side) {
        this.side = side;
    }

    double measure() {
        return (pow(side, 2));
    }
}
