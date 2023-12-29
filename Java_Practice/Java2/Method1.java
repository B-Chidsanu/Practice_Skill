class Method1 {
    public static void main(String[] args) {
        openVideo();
        playVideo();
        pauseVideo();
        exitProgram();
    }

    static void display() {

        System.out.println("Hello World");
    }

    static void plus() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Summary = " + c);
    }

    static void openVideo() {
        System.out.println("Open Video File");
    }

    static void playVideo() {
        System.out.println("Play Video");
    }

    static void pauseVideo() {
        System.out.println("Pause Video");
    }

    static void exitProgram() {
        System.out.println("Clear Memory");
    }
}
