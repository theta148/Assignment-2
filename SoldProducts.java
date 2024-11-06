/**
 * @author Mihir Patel
 * This program will calculate the retail price of all the products being sold.
 */

import java.util.Scanner;

public class SoldProducts {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isDone = false;
        double price = 0.0;
        double totalPrice = 0;

        while (!isDone) {
            System.out.print("Enter product number (1-5 or 0 to stop): ");
            int product = console.nextInt();
            console.nextLine();
            switch (product) {
                case 0:
                    isDone = true;
                    break;
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
            }
            if (isDone) {
                continue;
            }
            System.out.print("Enter quantity sold: ");
            int quantity = console.nextInt();
            console.nextLine();

            double partialPrice = quantity * price;

            totalPrice += partialPrice;
        }
        System.out.printf("Total retail of all products sold is: %.2f", totalPrice);
    }
}