import java.util.Scanner;

class Method2 {
    public static void main(String[] args) {
        // String myIp = getIP();
        // System.out.println(myIp);
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Your Salary ");
        double salary = kb.nextDouble();
        System.out.println("Salary = " + salary);
        double bonus = getBonus();
        salary += bonus;
        System.out.println("Salary + Bonus = " + salary);
        System.out.println("Address = " + getMyAddess());
    }

    // static void display(String message) {
    // System.out.println("Enter input" + message);
    // }

    // static void fullname(String firstname, String lastname) {
    // System.out.println("Name = " + firstname + " Lastname = " + lastname);
    // }

    // static void plus(int a, int b) {
    // int c = a + b;
    // System.out.println("Summary = " + c);
    // }

    /* Modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปนแกรมหลัก ชื่อเมธอด(){} */
    static String getIP() {
        return "192.168.1.1";
    }

    static Double getBonus() {
        return 5000.0;
    }

    static void fullname() {
        // กระบวนการทำงานในโปรแกรมย่อยหรือเมธอดนี้
    }

    static String getMyAddess(){
        String city = "Chiagmai";
        return city;
    }
}
