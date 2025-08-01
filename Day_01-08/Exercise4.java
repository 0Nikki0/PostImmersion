import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(fun(x, y));
    }

    public static int fun(int x, int y) {
        if (x==y) {
            return x*y;
        }

        return fun(x, (x+y)/2) + fun((x+y)/2+1, y);
    }
}


//fun(2, 7) = 139