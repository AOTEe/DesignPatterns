package strategy;

public class SubCalculator implements Calculator{
    @Override
    public double count(double a, double b) {
        return a-b;
    }
}
