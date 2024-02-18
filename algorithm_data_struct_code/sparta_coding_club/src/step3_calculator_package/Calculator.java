package step3_calculator_package;

import java.util.Objects;

public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator()
    {
        this.addOperation = new AddOperation();
        this.substractOperation = new SubstractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();
    }
    public double    calculate(String operator, int firstNumber, int secondNumber)
    {
        if (Objects.equals(operator, "+"))
            return (addOperation.operation(firstNumber, secondNumber));
        if (Objects.equals(operator, "-"))
            return (substractOperation.operation(firstNumber, secondNumber));
        if (Objects.equals(operator, "*"))
            return (multiplyOperation.operation(firstNumber, secondNumber));
        if (Objects.equals(operator, "/"))
            return (divideOperation.operation(firstNumber, secondNumber));
        if (Objects.equals(operator, "%"))
            return (mod(firstNumber, secondNumber));
        System.out.println("Calculator Error: Invalid operator");
        return (-1);
    }
    private double   mod(int firstNumber, int secondNumber)
    {
        return (firstNumber % secondNumber);
    }
}
