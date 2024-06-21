public class App {
    public static void main(String[] args) {
        division(1, 1);
    }

    private static int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception: ");
            e.printStackTrace();
        } finally {
            return 0;
        }
    }
}