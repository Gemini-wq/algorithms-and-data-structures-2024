package ru.mirea.practice.u23k1158;

public final class Two {

    private Two() {
    }

    public static void main(String[] args) {
        Square square = new Square(1.0, 2.0, "red");
        Square circle = new Square(1.0, 2.0, "blue");
        System.out.println(square);
        System.out.println(circle);
    }
}