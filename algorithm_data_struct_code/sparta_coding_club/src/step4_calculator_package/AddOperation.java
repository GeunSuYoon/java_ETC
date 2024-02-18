package step4_calculator_package;

public class AddOperation extends AbstractOperation {
    @Override
    public double    operation(int firstNumber, int secondNumber)
    {
        return (firstNumber + secondNumber);
    }
}
