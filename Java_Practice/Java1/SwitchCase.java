import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Month: ");
        int month = kb.nextInt();
        String name;
        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            default:
                name = "Anathor Month";
                break;
        }
        System.out.println(name);

    }
}
