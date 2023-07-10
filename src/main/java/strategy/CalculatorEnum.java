package strategy;

//枚举类相关
public enum CalculatorEnum {
    ADD(1),SUB(2),MULTIPLY(3);

    private int value;


    //枚举类值的赋值和获取
    private CalculatorEnum(int i){
        this.value = i;
    }

    public int getValue(){
        return value;
    }


}
