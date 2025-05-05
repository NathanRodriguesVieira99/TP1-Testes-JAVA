package com.tp1;

public class ScientificCalculator {
    // método de Soma
    public double add(double a, double b) {
        return a + b;
    }

    // método de Subitração
    public double subtract(double a, double b) {
        return a - b;
    }

    // método de Multiplicação
    public double multiply(double a, double b) {
        return a * b;
    }

    // método de Divisão
    public double divide(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Division by zero");
        return a / b;
    }

    // método de Potência
    public double power(double base, double expoent) {
        return Math.pow(base, expoent);
    }

    // método de Raiz Quadrada
    public double squareRoot(double a) {
        if (a < 0)
            throw new IllegalArgumentException("Negative Number");
        return Math.sqrt(a);
    }

    // método de Log
    public double log(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("Log of non-positive number");
        return Math.log(a);
    }

    // método de Seno
    public double sin(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    // método de Cos
    public double cos(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

}
