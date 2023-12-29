import javafx.beans.binding.IntegerBinding;

class Index {
    public static void main(String[] args) {
        // int num1 = 10;
        // boolean status = true;
        // char ch = 'A';
        // float num2 = 20.5f;
        // double numDouble = num1;

        // System.out.println(num1 + " " + status + " " + ch + " " + num2);
        // {
        // int c = 400;
        // System.out.println(num1 + " " + c);
        // }
        // System.out.println(ch);
        // System.out.println(numDouble);

        // // แปลงจากข้อมูลใหญ่ไปเล็ก
        // double numDouble1 = 10.5;
        // int numInt = (int) numDouble1;
        // System.out.println(numInt);

        // String a = "Chidsanupong";
        // System.out.println(a);
        // System.out.println(a + " " + num2);

        // String g = String.valueOf(numInt);
        // System.out.println(g);

        // Check data Type??
        Integer a = 10;
        Double b = 20.5;
        String c = "Chidsanupong";
        Boolean d = true;
        // Char e = 'A';
        Float f = 20.4f;

        boolean result = a instanceof Integer;
        System.out.println("Result is: " + result);

        boolean result1 = b instanceof Double;
        System.out.println("Result is: " + result1);

        boolean result2 = c instanceof String;
        System.out.println("Result is: " + result2);

        boolean result3 = d instanceof Boolean;
        System.out.println("Result is: " + result3);

        boolean result4 = f instanceof Float;
        System.out.println("Result is: " + result4);

    }
}