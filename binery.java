import java.util.Scanner;

public class binery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.print(binery1(a));
    }

    static int binery1(int a) {
        int b = a%2;
        a = a/2;
        return b;
    }
}