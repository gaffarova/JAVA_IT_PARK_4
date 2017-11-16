package com.company;

public class LetterFinder implements Observer {
    private int letterCount = 0;

    @Override
    public void count(char a) {
        if (a >= 'A' && a <= 'Z' ||
                a >= 'a' && a <= 'z' ||
                a >= 'А' && a <= 'Я' ||
                a >= 'а' && a <= 'я') {
            letterCount++;
        }
    }

    @Override
    public String toString() {
        return ("Буквы - " + letterCount);
    }
}
