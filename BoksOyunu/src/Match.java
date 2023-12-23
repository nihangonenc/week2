public class Match {
        Fighter f1;
        Fighter f2;
        int minWeight;
        int maxWeight;

        public Match (Fighter f1, Fighter f2, int minWeight, int maxWeight) {
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }
         void run() {

            if (checkWeight()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");

                    if (Fighter.isWhoStart()){
                        System.out.println(this.f1.name + " ilk hamleyi yaptı");
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()){
                            break;
                        }

                    }else {
                        System.out.println(this.f2.name + " ilk hamleyi yaptı");
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()){
                            break;
                        }
                    }
                    printScore();
                }

            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }
        }

        boolean checkWeight() {
            return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                    (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
        }

        boolean isWin() {
            if (this.f1.health == 0) {
                System.out.println("Maçı Kazanan : " + this.f2.name);
                return true;
            } else if (this.f2.health == 0){
                System.out.println("Maçı Kazanan : " + this.f1.name);
                return true;
            }

            return false; //kazanan yok, dövüş devam edecek
        }



        void printScore() {
            System.out.println("------------");
            System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
            System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
        }
}
