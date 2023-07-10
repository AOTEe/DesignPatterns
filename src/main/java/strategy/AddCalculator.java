package strategy;

public class AddCalculator implements Calculator{
    @Override
    public double count(double a, double b) {
        return a + b;
    }
}
