import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        //Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime Palindromik Kelimedir.
        //Örnek : abba , asa , kavak, kayak vb.

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Palindromik olup olmadığını merak ettiğiniz kelimeyi giriniz:" );
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }
}