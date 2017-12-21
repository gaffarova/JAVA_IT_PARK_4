package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Parser parser = Parser.builder()
                .addObserver(new EmptySpaceFinder())
                .addObserver(new LetterFinder())
                .addObserver(new DigitFinder())
                .build();

        parser.parse("text 12 k");

        parser.toString();

        equals()


    }
}
