package step4_calculator_package;

public class DivideOperation extends AbstractOperation {
    @Override
    public double    operation(int firstNumber, int secondNumber)
    {
        return ((double) firstNumber / (double) secondNumber);
    }
}
