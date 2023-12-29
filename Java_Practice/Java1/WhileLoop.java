public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("Hi! " + count);
            count++;
            if (count > 100)
                break;
        }
    }
}
