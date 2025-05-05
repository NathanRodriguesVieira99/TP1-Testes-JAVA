package com.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de testes para ScientificCalculator.
 */
public class ScientificCalculatorTest {

    /**
     * Variáveis globais.
     */
    private static final double DELTA = 0.0001;
    private static final double THREE = 3.0;
    private static final double ONE = 1.0;
    private static final double ZERO = 0;
    private static final double FIVE = 5.0;
    private static final double TEN = 10.0;
    private static final double TWENTY_FIVE = 25.0;
    private static final double NEGATIVE_TWENTY_FIVE = -25.0;

    /**
     * Instância da calculadora, sempre instanciada antes de cada teste.
     */
    private ScientificCalculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new ScientificCalculator();
    }

    /**
     * OPERAÇÕES BÁSICAS.
     */

    @Test
    void add_twoNumbers_returnsCorrectSum() {
        // Arrange
        double valorI = THREE;
        double valorII = THREE;

        // Act
        double result = calculator.add(valorI, valorII);

        // Assert
        double valorEsperado = valorI + valorII;
        assertEquals(valorEsperado, result, DELTA,
                "Deve somar" + valorI + " " + valorII + " e resultar: " + valorEsperado);
    }

    @Test
    void subtract_ShouldSubtractCorrectly() {
        // Arrange
        double valorI = THREE;
        double valorII = THREE;

        // Act
        double result = calculator.subtract(valorI, valorII);

        // Assert
        double valorEsperado = valorI - valorII;
        assertEquals(valorEsperado, result, DELTA,
                "Deve subtrair" + valorI + " " + valorII + " e resultar: " + valorEsperado);
    }

    @Test
    void multiply_ShouldMultiplyCorrectly() {
        // Arrange
        double valorI = FIVE;
        double valorII = FIVE;

        // Act
        double result = calculator.multiply(valorI, valorII);

        // Assert
        double valorEsperado = valorI * valorII;
        assertEquals(valorEsperado, result, DELTA,
                "Deve multiplicar" + valorI + " " + valorII + " e resultar: " + valorEsperado);
    }

    @Test
    void divide_ShouldDivideCorrectly() {
        // Arrange
        double valorI = TEN;
        double valorII = THREE;

        // Act
        double result = calculator.divide(valorI, valorII);

        // Assert
        double valorEsperado = valorI / valorII;
        assertEquals(valorEsperado, result, DELTA,
                "Deve dividir" + valorI + " " + valorII + " e resultar: " + valorEsperado);
    }

    /**
     * OPERAÇÕES TRIGONOMÉTRICAS.
     */

    @Test
    public void log_ShouldHavePositiveNumber() {
        assertEquals(ZERO, calculator.log(ONE), DELTA);
        assertEquals(Math.log(TEN), calculator.log(TEN), DELTA);
        assertEquals(Math.log(Math.E), calculator.log(Math.E), DELTA);
    }

    @Test
    public void sin_ShouldCalculateSinOfCommonAngles() {
        assertEquals(0.0, calculator.sin(0), DELTA);
        assertEquals(1.0, calculator.sin(90), DELTA);
        assertEquals(0.0, calculator.sin(180), DELTA);
        assertEquals(-1.0, calculator.sin(270), DELTA);
    }

    @Test
    public void sin_ShouldCalculateSinOfLog() {
        double input = Math.E;
        double expected = Math.sin(Math.toRadians(1));
        assertEquals(expected, calculator.sin(calculator.log(input)), DELTA);
    }

    /**
     * TESTES DE VALIDAÇÕES E EXCEÇÕES DOS MÉTODOS.
     */

    @Test
    void squareRoot_ShouldBePositive() {
        // Arrange
        double valorInical = TWENTY_FIVE;
        double valorEsperado = FIVE; // raiz de 25 = 5

        // Act
        double result = calculator.squareRoot(valorInical);

        // Assert
        assertEquals(valorEsperado, result, DELTA, "A raiz quadrada deve ser um numero positivo");
    }

    @Test
    void squareRoot_shouldThrowMessageForNegativevalor() {
        // Arrange
        double valorInical = NEGATIVE_TWENTY_FIVE; // Usando a constante
        String mensagemSeForNegativo = "Negative Number";

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.squareRoot(valorInical), "Lança exceção para numero negativo");

        // Assert
        assertEquals(mensagemSeForNegativo, exception.getMessage(),
                "Mensagem de exceção deve ser: '" + mensagemSeForNegativo + "'");
    }

    @Test
    void divide_ShouldThrowMessageIfDivideByZero() {
        // Arrange
        double valorInicalI = THREE;
        double valorInicalII = ZERO;
        String mensagemSeForDividoPorZero = "Division by zero";

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(valorInicalI, valorInicalII), "Dividiu por 0");

        // Assert
        assertEquals(mensagemSeForDividoPorZero, exception.getMessage(),
                "Mensagem de exceção deve ser: '" + mensagemSeForDividoPorZero + "'");
    }
}
