import java.util.Scanner;

public class binery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.print(0);
        }
    }

    static int binery1(int a) {
        a = a%2;
        return a;
    }
}