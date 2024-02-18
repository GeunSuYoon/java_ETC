import step4_calculator_package.*;

public class Main {
    public static void main(String[] args) {
        Calculator  calculator;
        int         firstNumber = 42;
        int         secondNumber = 61;

        calculator = new Calculator(new AddOperation());
        // Result of add
        System.out.printf("Calculate result %d + %d = %.0f\n", firstNumber, secondNumber, calculator.calculate(firstNumber, secondNumber));
        calculator.setOperation(new SubstractOperation());
        // Result of substract
        System.out.printf("Calculate result %d - %d = %.0f\n", firstNumber, secondNumber, calculator.calculate(firstNumber, secondNumber));
        calculator.setOperation(new MultiplyOperation());
        // Result of multiply
        System.out.printf("Calculate result %d * %d = %.0f\n", firstNumber, secondNumber, calculator.calculate(firstNumber, secondNumber));
        calculator.setOperation(new DivideOperation());
        // Result of divide
        System.out.printf("Calculate result %d / %d = %.2f\n", firstNumber, secondNumber, calculator.calculate(firstNumber, secondNumber));
    }
}
