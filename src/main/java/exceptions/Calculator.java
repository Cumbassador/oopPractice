package exceptions;

public class Calculator {
    public int division(int num,int divider) {
        try {
            return num/divider;
        }catch (ArithmeticException arithmeticException){
            throw new CalculatorException("Деление на ноль");
        }


    }
}
