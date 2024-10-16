package Homework.Homework_16_10;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50) + 1;
        }

        System.out.println("Массив до замены: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }

        System.out.println("Массив после замены:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
