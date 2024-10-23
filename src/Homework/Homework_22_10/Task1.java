package Homework.Homework_22_10;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int n1 = 5;
        System.out.println(findMissingNumber(arr1, n1));

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int n2 = 10;
        System.out.println(findMissingNumber(arr2, n2));
    }

    public static int findMissingNumber(int[] arr, int n) {
        int total_sum = 0;
        for (int i = 1; i <= n; i++) {
            total_sum += i;
        }

        int array_sum = 0;
        for (int num : arr) {
            array_sum += num;
        }

        return total_sum - array_sum;

    }
}
