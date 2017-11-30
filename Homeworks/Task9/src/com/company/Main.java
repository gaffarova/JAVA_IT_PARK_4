package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int age[] = new int[10000];

        try {
            FileInputStream input = new FileInputStream("input.txt");
            int currentByte = input.read();
            int number = 0;
            while (currentByte != -1) {
                if (currentByte == ' ') {
                    currentByte = input.read();


                }
                currentByte = input.read();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < age.length; i++) {
            if (age[i] != 0) {
                System.out.println("The number of " + i + " years old people is " + age[i]);
            }

        }
    }
}



