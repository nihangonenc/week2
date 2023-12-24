import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int number;

        int [] list = {56, 34, 1, 8, 101, -2, -33};

        Arrays.sort(list); //dizideki elemanları küçükten büyüğe doğru sıraladık
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Dizideki aralığa uygun bir sayı giriniz: ");
        number = input.nextInt();

        int minValue = list[0]; //başlangıçta ilk elemana atadık
        int maxValue = list[list.length -1]; //son elemana atadık


        for (int i : list) {
            if (i < number){
                minValue = i;

            }else if (i > number){
                maxValue = i;
                break;
            }

        }
        System.out.println("Girilen sayıya yakın dizideki en küçük sayı : " + minValue);
        System.out.println("Girilen sayıya yakın dizideki en büyük sayı : " + maxValue);















    }
}