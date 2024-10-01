package Homework.Homework_30_09;

public class Task2 {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int dividing(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int resSum = sum(3,5);
        int resMinus = minus(25, 19);
        int resMultiply = multiply(5, 5);
        int resDividing = dividing(456, 56);

        System.out.println("Сумма: " + resSum);
        System.out.println("Вычитание: " + resMinus);
        System.out.println("Умножение: " + resMultiply);
        System.out.println("Деление: " + resDividing);

    }
}
