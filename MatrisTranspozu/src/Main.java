import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row;
        int column;

        System.out.print("Satır sayısı giriniz: "); // Kullanıcıdan satır ve sütun sayıları isteniyor
        row = input.nextInt();
        System.out.print("Sütun sayısı giriniz: ");
        column = input.nextInt();


        int[][] matris = new int[row][column];

        int value = 1;
        System.out.println( "Matris:" );

        for (int i = 0; i < row; i++) { //kullanıcının girdiği satır ve sütun bilgisiyle matris oluşturuluyor.
            for (int j = 0; j < column; j++) {
                matris[i][j] = value;
                value++;
                System.out.print( matris[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] transpozMatris = new int[column][row]; // transpoz matris oluşturuluyor.
        System.out.println("Transpoze matris:");


        for (int i = 0; i < transpozMatris.length; i++) {
            for (int j = 0; j < transpozMatris[i].length; j++) {

                transpozMatris[i][j] = matris[j][i];
                System.out.print( transpozMatris[i][j] + "  ");
            }
            System.out.println();
        }

    }
}