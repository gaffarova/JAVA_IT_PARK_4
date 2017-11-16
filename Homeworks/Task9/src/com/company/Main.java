package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            int currentByte = input.read();
            while (currentByte != -1) {



            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }

    }
}
