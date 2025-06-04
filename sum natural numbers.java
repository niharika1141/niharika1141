public class Main {
    static int sumNaturalNumbers(int n) {
        if (n == 1)
            return 1;
        else
            return n + sumNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int Number = 10;  // You can change this to any number you want
        int result = sumNaturalNumbers(Number);
        System.out.println("Sum of natural numbers: " + result);
    }
}