package ru.itpark;

import java.util.Scanner;

public class Program {

    boolean isLetter(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else {
            return false;
        }
    }

    boolean isUpper(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    boolean isLower(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public void check(char c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your character");
        c = scanner.next().charAt(0);
        if ((isLetter(c) == true) && (isUpper(c) == true)) {
            System.out.println("It is an upper letter");
        } else if ((isLetter(c) == true) && (isLower(c) == true)) {
            System.out.println("It is a lower letter");
        } else if (isDigit(c) == true) {
            System.out.println("It is a digit");
        } else {
            System.err.println("Please use digits or Latin letters");
        }


    }
}



