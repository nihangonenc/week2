
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dizideki sayıların harmonik ortalamasını hesaplar.

        int [] list = {3,67,34,90,4,23,7,12,45};

        double harmonic = 0.0;

        for (int i=0; i < list.length; i++){
            harmonic += 1.0/list[i];
        }

        double harmonicMean = list.length / harmonic;
        System.out.println("Harmonik ortalama: " + harmonicMean);













    }
}