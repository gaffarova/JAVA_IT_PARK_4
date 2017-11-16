package com.company;

public class EmptySpaceFinder implements Observer {
    private int emtySpaceCount = 0;

    @Override
    public void count(char a) {
        if (a == ' ') {
            emtySpaceCount++;
        }
    }

    @Override
    public String toString() {
        return ("Пробелы - " + emtySpaceCount);
    }
}
