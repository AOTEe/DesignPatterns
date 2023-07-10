package strategy;

public class CountClient {
    public static void main(String[] args) {
        double v = new CalculatorContext(CalculatorEnum.ADD).concreteCount(1, 2);
        System.out.println(v);
    }
}
