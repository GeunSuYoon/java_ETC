package step4_calculator_package;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public double    operation(int firstNumber, int secondNumber)
    {
        return (firstNumber * secondNumber);
    }
}
