import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Your Height (cm): ");
        double height = sc.nextDouble();
        height /= 100;

        double bmi = weight / (height * height);

        System.out.println("-------------------------------------------");
        System.out.println("Your Weight = " + weight + " kg.");
        System.out.println("Your Height = " + height + " cm.");
        System.out.format("BMI = %.2f \n", bmi);
        System.out.println("BMI = " + String.format("%.2f", bmi));
    }
}
