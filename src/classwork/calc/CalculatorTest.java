package classwork.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator mycalculator=new Calculator();
       long result1= mycalculator.gumarum(5,6);
        System.out.println(result1);
        int result2=mycalculator.hanum(6,4);
        System.out.println(result2);
        long result3=mycalculator.bazmapatkum(8,78);
        System.out.println(result3);
        double result4= mycalculator.bajanum(489,49);
        System.out.println(result4);
    }
}
