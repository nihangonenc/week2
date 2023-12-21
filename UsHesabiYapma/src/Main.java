import java.util.Scanner;

public class Main {
    //taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan program
    public static int usAlma(int base, int exponent) {

        if (exponent<0) {
            return (base * usAlma(base, (exponent + 1)));
        } else if (exponent>0) {
            return base * usAlma(base, (exponent - 1));
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();

        int power = usAlma(base, exponent);

        System.out.println(base + "^" + exponent + " = " + power);
    }
}