import view.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.start();
    }

    public static int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[1];
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++)
            res[i] = a[i] / b[i];

        return res;
    }
    public static float isFloat(String input) {
        try {
            return Float.parseFloat(input);
        } catch (RuntimeException e){
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        if (intArray.length < 9){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }
        if (d == 0){
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        }
        double res = (double) intArray[8] / d;
        System.out.printf("intArray[8] / d = %d / %d = " + res + "\n", intArray[8], d);
        return res;
    }

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        printSum(a,b);
        if(b == 0){
            return 0;
        }
        return (double) a /b;
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a+b);
    }

    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        if (a == ' '){
            throw new RuntimeException("Empty string has been input.");
        }
        return "Your input was - " + a + "\n";
    }
}
