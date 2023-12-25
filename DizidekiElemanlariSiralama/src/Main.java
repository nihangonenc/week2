import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun?: ");
        int n = input.nextInt();
        int[] list = new int [n]; //boyutu kullanıcı belirledi

        System.out.println("Dizinin elemanlarını giriniz: ");

        for( int i=0; i< n; i++){

            System.out.print( (i+1) + ". Elemanı: " );
            list [i] = input.nextInt();

        }

        Arrays.sort(list);
        System.out.println("Sıralama: " + Arrays.toString(list));





    }
}