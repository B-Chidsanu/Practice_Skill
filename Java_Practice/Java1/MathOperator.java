import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 = ");
        int a = sc.nextInt();

        System.out.print("Enter num 2 = ");
        int b = sc.nextInt();
         
        System.err.println("*--------------------------------------*");
        System.out.println("Sumation = " + (a + b));
        System.out.println("Nagative = " + (a - b));
        System.out.println("Multipli = " + (a * b));
        System.out.println("Divide = " + (a / b));
        System.out.println("Modulude = " + (a % b));
    }
}
