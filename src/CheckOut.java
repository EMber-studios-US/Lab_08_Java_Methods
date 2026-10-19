import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMore = true;

        while (hasMore) {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 10.00);
            totalCost = totalCost + itemPrice;
            hasMore = SafeInput.getYNConfirm(in, "Do you have another item?");
        }

        System.out.printf("\nTotal cost: $%.2f\n", totalCost);
    }
}