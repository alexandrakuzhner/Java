package Homework.Homework_01_10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String first = scan.nextLine();
        System.out.print("Введите второе слово: ");
        String second = scan.nextLine();

        if (first.length() % 2 == 0 && second.length() % 2 == 0){

            String firstHalf = first.substring(0, first.length() / 2);
            String secondHalf = second.substring(second.length() / 2);
            String result = firstHalf + secondHalf;

            System.out.println("Результат: " + result);
        }


    }
}
