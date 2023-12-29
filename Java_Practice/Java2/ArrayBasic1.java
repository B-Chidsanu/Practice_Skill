import java.util.Stack;

public class ArrayBasic1 {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50, 60 };
        boolean[] status = { true, false, true, false };
        int a = status.length;

        String[] fruits = { "Apple", "Orange", "Papaya" };

        // System.out.println(number.length);
        // System.out.println(a);
        // System.out.println(fruits[0]);

        // for (int i = 0; i <= fruits.length; i++) {
        // System.out.println(i + " = " + fruits[i]);
        // }

        for (String data : fruits) {
            System.out.println(data);
        }

        int sum = 0;
        for (int data1 : number) {
            sum += data1;
        }
        System.out.println("Summary = " + sum);
    }

}
