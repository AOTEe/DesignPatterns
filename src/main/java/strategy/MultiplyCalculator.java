package strategy;

public class MultiplyCalculator implements Calculator{
    @Override
    public double count(double a, double b) {
        return a * b;
    }
}
