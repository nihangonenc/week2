
public class Main {
    public static void main(String[] args) {

        //Dövüşçüler oluşturuldu
        Fighter f1 = new Fighter("Marc" , 15 , 100, 90, 30);
        Fighter f2 = new Fighter("Alex" , 10 , 95, 100, 40);

        //Maç oluşturuldu
        Match match = new Match(f1, f2, 85 , 105);

        //Maç başlatıldı
        match.run();

    }
}