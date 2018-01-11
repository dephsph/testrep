public class Calculation {

    public double calculate(double num1, double num2, char operation) {

        double midResult = 0;

        switch (operation) {

            case '+':
                midResult = num1 + num2;
                break;
            case '-':
                midResult = num1 - num2;
                break;
            case '*':
                midResult = num1 * num2;
                break;
            case '/':
                midResult = num1 / num2;
                break;
        }
        return midResult;
    }
}