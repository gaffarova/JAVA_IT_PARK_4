package com.company;

public class EmptySpaceFinder implements Observer {
    private int emptySpaceCount = 0;

    @Override
    public void count(char a) {
        if (a == ' ') {
            emptySpaceCount++;
        }
    }

    @Override
    public String toString() {
        return ("Пробелы - " + emptySpaceCount);
    }
}
