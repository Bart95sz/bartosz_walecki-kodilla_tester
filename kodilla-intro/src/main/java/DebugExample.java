public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 112;
        int secondNumber = 711;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }

    private static void sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;

        System.out.println(result);
    }
}