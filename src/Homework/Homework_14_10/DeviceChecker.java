package Homework.Homework_14_10;

public class DeviceChecker {
    public static boolean checkDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkDevice(120, 80));
        System.out.println(checkDevice(90, 110));
    }
}
