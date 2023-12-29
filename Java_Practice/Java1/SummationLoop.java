import java.util.Scanner;

public class SummationLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int sum = 0, count = 0;

        while (true) {
            System.out.print("Enter number: ");
            int number = kb.nextInt();
            if (number < 0)
                break;
            count++;
            sum += number;
        }
        System.out.println("Summation = " + sum);
        System.out.println("Average = " + (sum / count)); /* หาค่าเฉลี่ย */
    }
}
