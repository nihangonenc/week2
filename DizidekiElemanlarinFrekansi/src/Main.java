import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int [] list = {12,6,9,3,17,6,12,0,2,-1,17,-1,6};

        System.out.println(Arrays.toString(list));



        for( int i=0; i < list.length; i++ ){
            int frekans = 0;

            if (list[i] == -10000) {
                continue;
            }

            for (int j = 0; j < list.length; j++) {
                if ( (list[i] == list[j])) {
                        frekans++;
                        if(i!=j){
                            list[j]=-10000;
                        }
                }
            }

            System.out.println(list[i] + " sayısı " + frekans + " kere tekrar edildi.");
        }
    }
}