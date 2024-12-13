package ru.mirea.practice.u23k1158;

public class ConcreteComplex implements Complex {
    private int real;
    private int imaginary;

    public ConcreteComplex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getReal() {
        return real;
    }

    @Override
    public double getImaginary() {
        return imaginary;
    }
}
