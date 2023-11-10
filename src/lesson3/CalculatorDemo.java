package lesson3;

public class CalculatorDemo {
    public static void main(String[] args) {
        //создадим новый объект типа Calculator, для того чтобы мы могли
        // сохранить значения в переменных т пользоваться ими
        Calculator calc = new Calculator () ;

        // сохраним в переменных какие-нибудь значения
        calc.x = 10 ;
        calc.y = 5 ;

        calc.printSum();
    }
}
