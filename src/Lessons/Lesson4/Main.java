package Lessons.Lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


    //String str = "Java";
    //System.out.println(str);
    //System.out.println(str.hashCode());
    //str = str + "!!!";
    //System.out.println(str);
    //System.out.println(str.hashCode());

    //int strLength = str.length();
    //System.out.println(strLength);

    //System.out.println(str.substring(4));
    //System.out.println(str.substring(3, 5));

    String dfg = "I like Java";
        System.out.println(dfg.charAt(dfg.length() - 1));
        System.out.println(dfg.endsWith("!!!"));
        System.out.println(dfg.startsWith("I like"));
        System.out.println(dfg.contains("Java"));


//        byte byteNum = 100;
//        System.out.println(byteNum);
//        short shortNum = byteNum;
//        System.out.println(shortNum);
//        int intNum = byteNum;
//        double doubleNum = byteNum;
//        int intNum = 129;
//        System.out.println(intNum);
//        byte byteNum = (byte)intNum;
//        System.out.println(byteNum);

        int intNum = 33000;
        System.out.println(intNum);
//        byte byteNum = (byte)intNum;
//        System.out.println(byteNum);
        short shortNum = (short) intNum;
        System.out.println(shortNum);

        int num1 = 10;
        double num2 = 20;
        int res = (int)(num1 + num2);
//        System.out.println(num1 + num2);
        System.out.println(res);
    }
}
