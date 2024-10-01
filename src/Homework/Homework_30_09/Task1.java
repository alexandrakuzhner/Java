package Homework.Homework_30_09;

public class Task1 {
    public static void main(String[] args) {
        String create = new String("I study Basic Java!");
        System.out.println(create.charAt((create.length() - 2)));
        System.out.println(create.contains("Java"));
        System.out.println(create.substring(14, 18));

        String newCreate = create.replace('a', 'o');
        System.out.println(newCreate);
        System.out.println(newCreate.toUpperCase());
        System.out.println(newCreate.toLowerCase());

        
    }
}
