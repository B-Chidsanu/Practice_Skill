public class Array2D {
    public static void main(String[] args) {
        String[][] products = {
                { "Chair", "Table", "Lamp" },
                { "Keyboard", "Mouse", "Keyboard" },
                { "Lipstick", "Ro-on", "Cream" }
        };
        for (int row = 0; row < products.length; row++) {
            for (int column = 0; column < products.length; column++) {
                System.out.println("Row = " + row + " Column = " + column + " = " + products[row][column]);
            }
        }

        // System.out.println("Before = " + products[1][2]);
        // products[1][2] = "Mouse Pad";
        // System.out.println("After = " + products[1][2]);
    }
}
