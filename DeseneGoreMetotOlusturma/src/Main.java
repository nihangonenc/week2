import java.util.Scanner;

public class Main {
    //Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    //Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        recursiveMethod(number, number, true);
    }

    public static void recursiveMethod (int a, int b, boolean isDecreasing) { //

        if (a>0 && isDecreasing) {          //Sayı sıfırdan büyükse azaltmaya başlıyoruz.
            System.out.print(a + " ");
            recursiveMethod(a - 5, b, true); // 5 azaltarak metodu yeniden çağırıyoruz.

        }else {// number <= 0
            if ( a<=b){ // Sayı hala kendisinden küçük ya da eşitse;
                System.out.print( a+ " ");
                recursiveMethod(a+5, b, false); // Sayıyı 5 arttırıp metodu yeniden çağırıyoruz.
            }
        }
    }
}
