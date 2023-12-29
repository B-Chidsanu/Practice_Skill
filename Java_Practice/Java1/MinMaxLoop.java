import java.util.Scanner;

public class MinMaxLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int maxNum = 0, minNum = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter number: ");
            int number = kb.nextInt();
            if (number < 0)
                break;
            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.println("Max number = " + maxNum);
        System.out.println("Min number = " + minNum);
    }
}
