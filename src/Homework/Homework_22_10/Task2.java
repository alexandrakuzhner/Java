package Homework.Homework_22_10;

public class Task2 {
    public static void main(String[] args) {
        Object[] params = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true};
        System.out.println(buildSQLQuery("cars", params));

        int a = 7, b = 0, c = -5;
        sortNumbers(a, b, c);
    }

    public static String buildSQLQuery(String tableName, Object[] params) {
        StringBuilder query = new StringBuilder("SELECT * FROM " + tableName + " WHERE ");
        boolean firstCondition = true;

        for (int i = 0; i < params.length; i += 2) {
            String field = (String) params[i];
            Object value = params[i + 1];

            if (value != null) {
                if (!firstCondition) {
                    query.append(" AND ");
                }
                if (value instanceof String) {
                    query.append(field).append(" = '").append(value).append("'");
                } else {
                    query.append(field).append(" = ").append(value);
                }
                firstCondition = false;
            }
        }

        return query.toString();
    }

    public static void sortNumbers(int a, int b, int c) {
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Возрастающая последовательность: " + a + " " + b + " " + c);
    }
}
