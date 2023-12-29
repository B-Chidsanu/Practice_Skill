import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Year (พศ.) = ");
        int year = kb.nextInt();

        int result = year - 543;
        System.out.println(result);
        
    }
}
