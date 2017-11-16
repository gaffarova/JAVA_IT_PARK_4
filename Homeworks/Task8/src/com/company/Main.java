package com.company;

public class Main {

    public static void main(String[] args) {
        Parser parser = Parser.builder()
                .addObserver(new EmptySpaceFinder())
                .addObserver(new LetterFinder())
                .addObserver(new DigitFinder())
                .build();

        parser.parse("text");

        parser.toString();



    }
}
