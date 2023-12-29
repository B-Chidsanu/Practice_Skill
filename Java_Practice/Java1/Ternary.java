import java.util.Scanner;


public class Ternary {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = kb.nextInt();

        String result = "";

        // if (number % 2 == 0) {
        // result = number + " = Even numbers";
        // } else {
        // result = number + " = odd number";
        // }
        // System.out.println(result);

        /* เป็นการเขียน if/else แบบลดรูป */
        result = (number % 2 == 0) ? number + " = Even numbers" : number + " = odd number";
        System.out.println(result);
    }
}
