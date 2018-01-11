import java.util.Scanner;

public class GetDouble {

    public static Double getDouble() {

        System.out.println("Введите число: ");

        Scanner read = new Scanner(System.in);
        double num = read.nextDouble();

        return num;

    }
}
