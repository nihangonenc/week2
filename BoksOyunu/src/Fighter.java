public class Fighter {
        String name;
        int damage; //hasar
        int health;
        int weight;
        double dodge; //gelen hasarı engelleme

        public Fighter(String name, int damage, int health, int weight, double dodge) {
            this.name = name;
            this.damage = damage;
            this.health = health;
            this.weight = weight;
            if( dodge>=0 && dodge<= 100){ //Blok şansı 0-100 arasında olmalı
                this.dodge = dodge;
            }else{
                this.dodge = 0;
            }

        }

        public int hit(Fighter foe) { //rakibin değeri geliyor

            System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

            if (foe.isDodge()) {
                System.out.println(foe.name + " gelen hasarı blokladı.");
                return foe.health;
            }

            if (foe.health - this.damage < 0){
                return 0;
            }

            return foe.health - this.damage;
        }
         static boolean isWhoStart(){ //ilk hamleyi kim yapacak?
            double randomNumber = Math.random() * 100;
            return randomNumber >= 50;
         }

        boolean isDodge() { //Rakibi bloklayabilir mi?
            double randomValue = Math.random() * 100;  //Rastgele bir sayı üretiyoruz.
            return randomValue <= this.dodge;
        }
}
