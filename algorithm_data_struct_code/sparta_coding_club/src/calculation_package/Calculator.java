package calculation_package;

import java.util.Objects;

public class Calculator {
    public static double    calculate(String operator, int firstNumber, int secondNumber)
    {
        if (Objects.equals(operator, "+"))
            return (add(firstNumber, secondNumber));
        if (Objects.equals(operator, "-"))
            return (sub(firstNumber, secondNumber));
        if (Objects.equals(operator, "*"))
            return (mult(firstNumber, secondNumber));
        if (Objects.equals(operator, "/"))
            return (div(firstNumber, secondNumber));
        if (Objects.equals(operator, "%"))
            return (mod(firstNumber, secondNumber));
        System.out.println("Calculator Error: Invalid operator");
        return (-1);
    }
    private static double   add(int firstNumber, int secondNumber)
    {
        return (firstNumber + secondNumber);
    }

    private static double   sub(int firstNumber, int secondNumber)
    {
        return (firstNumber - secondNumber);
    }
    private static double   mult(int firstNumber, int secondNumber)
    {
        return (firstNumber * secondNumber);
    }
    private static double   div(int firstNumber, int secondNumber)
    {
        return ((double)firstNumber / (double)secondNumber);
    }
    private static double   mod(int firstNumber, int secondNumber)
    {
        return (firstNumber % secondNumber);
    }
}
