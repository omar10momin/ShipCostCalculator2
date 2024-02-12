import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = 0;
        if (in.hasNextDouble()) {
            price = in.nextDouble();
            if (price >= 100) {
                System.out.println("Shipping cost: $0.00");
            } else {
                double shippingCost = price * 0.02;
                System.out.printf("Shipping cost: $%.2f\n", shippingCost);
            }
            double totalPrice = price;
            System.out.printf("Total price: $%.2f\n", totalPrice);
        } else {
            String trash = in.nextLine();
            System.out.println("Run the program again and enter a valid amount!");
        }
    }
}
