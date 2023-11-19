import java.util.Scanner;

public class avrage {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in chemistry");
        int c = sc.nextInt();

        System.out.println("Enter your marks in Biology");
        int b = sc.nextInt();
        

        System.out.println("Enter your marks in physics");
        int p = sc.nextInt();
        
        int sum = p+b+c;
        double average = (sum/3);
        System.out.println("The average in science is " +average);

        sc.close();
    }
    
}