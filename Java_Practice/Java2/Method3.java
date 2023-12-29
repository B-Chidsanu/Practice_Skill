class Method3 {
    public static void main(String[] args) {
        int maxResult = maxNumber(100, 100);
        System.out.println("Max Number = " + maxResult);
        
        int minResult = minNumber(-10, 50);
        System.out.println("Min Number = " + minResult);

        int sum = summation(50, 50);
        System.out.println("Summation = " + sum);
    }

    static int maxNumber(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int minNumber(int a, int b) {
        if (a == b) {
            return a;
        } else if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    static int summation(int x, int y) {
        int total = x + y;
        return total;
    }

}
