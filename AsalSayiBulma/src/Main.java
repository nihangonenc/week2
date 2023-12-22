import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int userNumber = input.nextInt();

        if (isPrimeNumber(userNumber, 2)) {
            System.out.println(userNumber + " bir asal sayıdır.");
        } else {
            System.out.println(userNumber + " bir asal sayı değildir.");
        }
    }
    static boolean isPrimeNumber(int number, int divisor) { // Recursive metot:
        if (number < 2 ) {
            return false;
        }
        if (divisor > number / 2) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimeNumber(number, divisor + 1); // Recursive metodu kullandık.
    }
}