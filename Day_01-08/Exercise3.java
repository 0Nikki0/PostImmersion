import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(fun(x, y));
    }

    public static int fun(int x, int y) {
        if(y == 0 || y == x) {
            return 1;
        }

        return fun(x-1, y) + fun(x-1, y-1);
    }
}
