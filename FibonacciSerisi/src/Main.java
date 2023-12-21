import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {
        // 1 1 2 3 5 8 13
        // f(1) + f(2) = F(3)
        // f(2) + f(3) = f(4)
        // f(3) + f(4) = f(5)
        // f(n-2) + f(n-1) = f(n)
        if ( n==1 || n==2){
         return 1;
        }
        return fibonacci (n-2) + fibonacci(n-1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin kaçıncı elemanını görmek istiyorsunuz? ");
        int n = input.nextInt();

        System.out.println(n + ". eleman: " + fibonacci(n));
    }

}