package ru.itpark;

class Diamond extends Shape {

    public String toString() {
        return("Diamond");
    }

    int diagonal1;
    int diagonal2;

    Diamond (int diagonal1, int diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    double measure() {
        return ((diagonal1 * diagonal2) / 2.0);
    }
}
