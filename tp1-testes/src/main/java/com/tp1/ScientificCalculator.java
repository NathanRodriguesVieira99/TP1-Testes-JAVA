package com.tp1;

/**
 * Classe responsável por operações matemáticas.
 */
public class ScientificCalculator {

    /** constructor. */
    public ScientificCalculator() {

    }

    // ------------------- Operações Aritméticas -------------------

    /**
     * Soma dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return soma de a e b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtrai dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return subtração de a e b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return multiplicação de a e b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divide dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return divisão de a e b
     * @throws IllegalArgumentException se dividir por 0
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    // ------------------- Operações Algébricas -------------------

    /**
     * Calcula a potência de uma base elevada a um expoente.
     *
     * @param base    a base da potência
     * @param expoent o expoente
     * @return o resultado de base elevado ao expoente
     */
    public double power(double base, double expoent) {
        return Math.pow(base, expoent);
    }

    /**
     * Calcula a raiz quadrada de um número.
     *
     * @param a o número de entrada
     * @return a raiz quadrada de a
     * @throws IllegalArgumentException se a for negativo
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Negative Number");
        }
        return Math.sqrt(a);
    }

    // ------------------- Operações Exponenciais -------------------

    /**
     * Calcula o logaritmo um número.
     *
     * @param a o número de entrada
     * @return o logaritmo de a
     * @throws IllegalArgumentException se a for menor ou igual a 0
     */
    public double log(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Log of non-positive number");
        }
        return Math.log(a);
    }

    // ------------------- Operações Trigonométricas -------------------

    /**
     * Calcula o seno de um ângulo em graus.
     *
     * @param degrees ângulo em graus
     * @return o seno do ângulo
     */
    public double sin(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    /**
     * Calcula o cosseno de um ângulo em graus.
     *
     * @param degrees o ângulo em graus
     * @return o cosseno do ângulo
     */
    public double cos(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

}
