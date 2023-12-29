import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter your Ege: ");
        int age = keyBoard.nextInt();
        
        if (age >= 15 && age <= 19) {
            System.out.println("Adolescent");
        } else if (age >= 20 && age <= 29) {
            System.out.println("Teenager");
        } else if (age >= 30 && age <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Older");
        }
    }
}
