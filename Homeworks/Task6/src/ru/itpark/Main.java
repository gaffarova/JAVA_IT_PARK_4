package ru.itpark;

public class Main {

    public static void main(String[] args) {

        Point point = new Point();
        Triangle triangle = new Triangle(3, 4);
        Circle circle = new Circle(12);
        Square square = new Square(8);
        Diamond diamond = new Diamond(7, 9);
        Shape[] s = {point, triangle, circle, square, diamond};

        System.out.println("An area has been measured");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString() + ": " + s[i].measure());
        }


    }
}
