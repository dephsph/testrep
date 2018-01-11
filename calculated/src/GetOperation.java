import java.util.Scanner;

public class GetOperation {

    public static Character operatation() {

        Scanner read = new Scanner(System.in);

        System.out.println("Введите оператор: ");
        char operator = read.next().charAt(0);

        return operator;
    }
}
