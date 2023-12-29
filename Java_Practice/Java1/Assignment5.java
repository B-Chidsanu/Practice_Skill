import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Temperator (F): ");
        float fahran = kb.nextFloat();

        float cel = (fahran - 32) * 5 / 9;
        System.out.println(fahran + " Fahrenheit = " + String.format("%.2f", cel) + " celsius");
    }
}
