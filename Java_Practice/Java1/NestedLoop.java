import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter First number of Multipli: ");
        int numStart = kb.nextInt();
        System.out.print("Enter Last number of Multipli: ");
        int numStop = kb.nextInt();

        for (int i = numStart; i <= numStop; i++) {
            System.out.println("Number: " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + "x" + j + " = " + i * j);
            }

        }
    }
}
