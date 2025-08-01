import java.util.Scanner;
public class Exercise1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fact(n));
    }

    // public static int fact(int n) {
    //     if (n <= 1) {
    //         return n;
    //     }  
    //     else if(n > 1 && n%2 == 0) {
    //         return n * fact(n/2);
    //     }else {
    //         return fact(n+1/2) + fact(n-1/2);
    //     }
    // }

    public static int fact(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
