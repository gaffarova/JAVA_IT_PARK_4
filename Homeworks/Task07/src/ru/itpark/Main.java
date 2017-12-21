package ru.itpark;

public class Main {

    public static void main(String[] args) {
        char number[] = {'1', '2', '3', '4'};
        int x = parse(number);
        System.out.println(x);
    }

    static int parse(char number[]) {
        int sum = 0;
        int degree = 1;
        for (int i = number.length - 1; i >= 0; i--) {
            int a = (number[i] - '0');
            sum = sum + a * degree;
            degree *= 10;
        }
        return sum;
    }
}




