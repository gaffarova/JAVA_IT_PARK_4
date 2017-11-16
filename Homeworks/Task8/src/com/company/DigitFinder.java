package com.company;

public class DigitFinder implements Observer {
    private int digitCount = 0;

    @Override
    public void count(char a) {
        if (a >= '0' && a <= '9') {
            digitCount++;
        }
    }

    @Override
    public String toString() {
        return ("Цифры - " + digitCount);
    }
}
