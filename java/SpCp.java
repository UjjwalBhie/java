import java.util.*;

public class SpCp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        if (profit > 0) {
            System.out.println("Profit Percentage: " + profitPercentage + "%");
        } else if (profit < 0) {
            System.out.println("Loss Percentage: " + (-profitPercentage) + "%");
        } else {
            System.out.println("No profit or loss.");
        }
    }
}
