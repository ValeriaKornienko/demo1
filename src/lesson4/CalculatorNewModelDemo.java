package lesson4;

public class CalculatorNewModelDemo {
    public static void main(String[] args){
    CalculatorNemModel calc = new CalculatorNemModel();

    int result = calc.sum (10,5);
    System.out.println("Сумма значений = " + result);

    result = calc.sub(10,8);
    System.out.println("Результат вычитания = " + result);

    result = calc.mult(2, 2);
    System.out.println("Результат умножения = " + result);

    double resultDiv = calc.div(13,2);
    System.out.println("Резульат деления = " + resultDiv);

    }
}
