package Homework.Homework_14_10;

public class BankAccount {
    public static int withdrawDays(int N) {
        int days = 0;

        while (N > 0) {
            int maxDivisor = 1;

            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    maxDivisor = i;
                }
            }

            N -= maxDivisor;
            days++;
        }

        return days;
    }

    public static void main(String[] args) {
        System.out.println(withdrawDays(21));
    }

}
