// PAGE 321
public class Main {

    public static void main(String[] args){

        double num1 = GetDouble.getDouble();
        double num2 = GetDouble.getDouble();
        double num3 = GetDouble.getDouble();

        char operator1 = GetOperation.operatation();
        char operator2 = GetOperation.operatation();

        Calculation calculation = new Calculation();

        double midResult = calculation.calculate(num1, num2, operator1);
        double result = calculation.calculate(midResult, num3, operator2);

        System.out.println("(" + num1 + " " + operator1 + " " + num2 + ") " + operator2 + " " + num3 + " = " + result);
        }
}