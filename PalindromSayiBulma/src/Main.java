import java.util.Scanner;
public class Main {
    static void isPalindrom (int number) {
        int newNumber = number;
        int reverseNumber = 0;
        int lastNumber;

        while (newNumber != 0) {
            lastNumber = newNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            newNumber /= 10;
        }

        if (number == reverseNumber) {
            System.out.print(number + " bir palindrom sayıdır.");
        } else {
            System.out.print(number + " bir palindrom sayı değildir.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Palindrom olup olmadığını merak ettiğiniz sayıyı giriniz : ");
        int number = input.nextInt();

       isPalindrom(number);

    }
}