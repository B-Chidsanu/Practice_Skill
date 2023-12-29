import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter money: ");
        int money = kb.nextInt();
        System.out.println("Your Money: " + money);

        if (money >= 1000) {
            System.out.println("1000 Baht = " + (money / 1000) + " chang");
            money %= 1000;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 500) {
            System.out.println("500 Baht = " + (money / 500) + " chang");
            money %= 500;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 100) {
            System.out.println("100 Baht = " + (money / 100) + " chang");
            money %= 100;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 50) {
            System.out.println("50 Baht = " + (money / 50) + " chang");
            money %= 50;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 20) {
            System.out.println("20 Baht = " + (money / 20) + " chang");
            money %= 20;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 10) {
            System.out.println("10 Baht = " + (money / 10) + " chang");
            money %= 10;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 5) {
            System.out.println("5 Baht = " + (money / 5) + " chang");
            money %= 5;
            // System.out.println("Scrap = " + money);
            System.out.println("----------------------------------------");
        }
        if (money >= 1) {
            System.out.println("1 Baht = " + (money / 1) + " chang");
            money %= 1;
            // System.out.println("Scrap = " + money);
        }

    }
}
