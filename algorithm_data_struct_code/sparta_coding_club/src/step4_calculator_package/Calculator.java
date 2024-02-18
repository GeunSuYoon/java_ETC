package step4_calculator_package;

import java.util.Objects;

public class Calculator {
    private AbstractOperation   operation;
    public          Calculator(AbstractOperation initOperation)
    {
        this.operation = initOperation;
    };

    public void     setOperation(AbstractOperation newOperation)
    {
        this.operation = newOperation;
    }

    public double   calculate(int firstNumber, int secondNumber)
    {
        return (operation.operation(firstNumber, secondNumber));
    }
}
