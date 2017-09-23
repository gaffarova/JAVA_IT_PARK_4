package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

	    System.out.print("Введите размер массива");

	    int size = input.nextInt();

	    int array[] = new int[size];

	    System.out.println("Введите числа");
	    for (int i = 0; i < size; i++)
        array [i] = input.nextInt();

	    if (array [i] / 2 = 0) then

                array [i] = 0;

                System.out.println(array[i]);
    }
}
