import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your weight (kg.): ");
        double weight = kb.nextDouble();
        System.out.print("Enter Your height (cm.): ");
        double height = kb.nextDouble();
        height /= 100;
        double bmi = weight / (height * height);
        System.out.println("Weight = " + weight + " kg.");
        System.out.println("Height = " + height + " cm.");
        System.out.println("BMI = " + String.format("%.2f", bmi));

        String result = "";

        if (bmi <= 18.5) {
            result = "Underweight";
        } else if (bmi > 18.5 && bmi <= 24.9) {
            result = "Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            result = "Overweight";
        } else {
            result = "Obese";
        }
        System.out.println("Your BMI is: " + result);
    }
}
