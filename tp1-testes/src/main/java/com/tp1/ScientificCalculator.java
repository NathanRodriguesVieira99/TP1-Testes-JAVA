package com.tp1;

public class ScientificCalculator {
    // método de Soma
    private double add(double a, double b) {
        return a + b;
    }

    // método de Subitração
    private double subtract(double a, double b) {
        return a - b;
    }

    // método de Multiplicação
    private double multiply(double a, double b) {
        return a * b;
    }

    // método de Divisão
    private double divide(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    // método de Potência
    private double power(double base, double expoent) {
        return Math.pow(base, expoent);
    }

    // método de Raiz Quadrada
    private double squareRoot(double a) {
        if (a < 0)
            throw new IllegalArgumentException("Negative Number");
        return Math.sqrt(a);
    }

    // método de Log
    private double log(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("Log of non-positive number");
        return Math.log(a);
    }

    // método de Seno
    private double sin(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    // método de Cos
    private double cos(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    // constructor
    public ScientificCalculator(double a, double b, double degrees, double base, double expoent) {
        this.add(a, b);
        this.subtract(a, b);
        this.multiply(a, b);
        this.divide(a, b);
        this.power(base, expoent);
        this.squareRoot(a);
        this.log(a);
        this.sin(degrees);
        this.cos(degrees);
    }

}
