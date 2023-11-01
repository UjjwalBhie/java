import java.util.Scanner;

public class Prime {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        boolean b = true;
        if (a % 2 == 0 || a % 3 == 0) {
            {b = true;}     
        }
        else{b = false;}
        if(b == true){System.out.println("It is not a Prime num");}
        else{System.out.println("It is prime");}
        sc.close();
    }
}