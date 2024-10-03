package Homework.Homework_01_10;
import java.util.Scanner;

public class Task3 {
    public static double convertToUSD(double euros) {

        double exchangeRate = 1.1;
        return euros * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в евро: ");
        double euros = scanner.nextDouble();
        double dollars = convertToUSD(euros);

        System.out.printf("Сумма в долларах США: %.2f%n", dollars);
    }
}
