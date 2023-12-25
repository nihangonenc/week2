import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr ,int value){
        for(int i : arr){
            if (i== value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 5, 13, 2, 8, 8, 9, 12, 2, 24, 2, 7, 9, 7, 24};

        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] % 2==0) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }

        for (int value: duplicate){
            if(value!= 0){
                System.out.println(value);
            }
        }
    }
}