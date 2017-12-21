package ru.itpark;

class Triangle extends Shape {

    public String toString() {
        return("Triangle");
    }

    int cathetus1;
    int cathetus2;

    Triangle(int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    double measure() {
        return ((cathetus1 * cathetus2) / 2.0);
    }
}
