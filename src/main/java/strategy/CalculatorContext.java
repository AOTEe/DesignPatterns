package strategy;

public class CalculatorContext {

    private Calculator calculator;

    public CalculatorContext(CalculatorEnum type){
        switch (type){
            case ADD:
                this.calculator = new AddCalculator();
                break;
            case SUB:
                this.calculator = new SubCalculator();
                break;
            case MULTIPLY:
                this.calculator = new MultiplyCalculator();
                break;
        }
    }

    public double concreteCount(double a,double b){
        return  calculator.count(a,b);
    }
}
