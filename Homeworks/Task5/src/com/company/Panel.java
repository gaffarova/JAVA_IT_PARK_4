package com.company;

import java.util.Scanner;

public class Panel {

    Scanner scanner = new Scanner(System.in);
    private TV tv;

    public Panel(TV tv) {
        this.tv = tv;
    }

    public void showTV() {
        System.out.println("What channel would you like to watch right now?\n" +
                "1. BBC\n" +
                "2. CNN\n" +
                "3. EURONEWS");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tv.showProgram(0);
                    break;
                case 2:
                    tv.showProgram(1);
                    break;
                case 3:
                    tv.showProgram(2);
                    break;
                default:
                    System.err.println("Something went wrong");
                    break;
            }
        }
    }

