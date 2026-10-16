import java.util.Scanner;

public class StoreCheckout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product1 = "Mouse";          int product1Price = 20;
        String product2 = "Keyboard";       int product2Price = 40;
        String product3 = "Headphones";     int product3Price = 50;
        String product4 = "Laptop Stand";   int product4Price = 30;

        int subTotal = 0;
        int currentTotal = 0;
        int finalTotal = 0;
        int purchasedQuantity = 0;
        int discount = 0;
        int optionChoosed;

        int mouseCount = 0;
        int keyboardCount = 0;
        int headphonesCount = 0;
        int laptopCount = 0;

        while (true) {
            System.out.println("===== SIMPLE STORE =====\n" +
                    "1. " + product1 + " - $" + product1Price + "\n" +
                    "2. " + product2 + " - $" + product2Price + "\n" +
                    "3. " + product3 + " - $" + product3Price + "\n" +
                    "4. " + product4 + " - $" + product4Price + "\n" +
                    "5. Checkout");

            System.out.print("Choose a product: ");
            optionChoosed = scanner.nextInt();

            if (optionChoosed == 1) {
                System.out.println("You selected: " + product1);
                System.out.println("Price: $" + product1Price);
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity.\nQuantity must be greater than 0.\n");
                } else {
                    currentTotal = product1Price * quantity;

                    if (quantity >= 5) {
                        currentTotal = (int) (currentTotal * 0.95);
                        System.out.println("Applied 5% bulk discount for buying 5+ units!");
                    }

                    subTotal += currentTotal;
                    purchasedQuantity += quantity;
                    mouseCount += quantity;
                    System.out.println("Added to cart! \nCurrent total: $" + subTotal + "\n");
                }
            }
            else if (optionChoosed == 2) {
                System.out.println("You selected: " + product2);
                System.out.println("Price: $" + product2Price);
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity.\nQuantity must be greater than 0.\n");
                } else {
                    currentTotal = product2Price * quantity;
                    if (quantity >= 5) {
                        currentTotal = (int) (currentTotal * 0.95);
                        System.out.println("Applied 5% bulk discount for buying 5+ units!");
                    }
                    subTotal += currentTotal;
                    purchasedQuantity += quantity;
                    keyboardCount += quantity;
                    System.out.println("Added to cart! \nCurrent total: $" + subTotal + "\n");
                }
            }
            else if (optionChoosed == 3) {
                System.out.println("You selected: " + product3);
                System.out.println("Price: $" + product3Price);
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity.\nQuantity must be greater than 0.\n");
                } else {
                    currentTotal = product3Price * quantity;
                    if (quantity >= 5) {
                        currentTotal = (int) (currentTotal * 0.95);
                        System.out.println("Applied 5% bulk discount for buying 5+ units!");
                    }
                    subTotal += currentTotal;
                    purchasedQuantity += quantity;
                    headphonesCount += quantity;
                    System.out.println("Added to cart! \nCurrent total: $" + subTotal + "\n");
                }
            }
            else if (optionChoosed == 4) {
                System.out.println("You selected: " + product4);
                System.out.println("Price: $" + product4Price);
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity.\nQuantity must be greater than 0.\n");
                } else {
                    currentTotal = product4Price * quantity;
                    if (quantity >= 5) {
                        currentTotal = (int) (currentTotal * 0.95);
                        System.out.println("Applied 5% bulk discount for buying 5+ units!");
                    }
                    subTotal += currentTotal;
                    purchasedQuantity += quantity;
                    laptopCount += quantity;
                    System.out.println("Added to cart! \nCurrent total: $" + subTotal + "\n");
                }
            }
            else if (optionChoosed == 5) {
                System.out.println("===== CHECKOUT =====");
                System.out.println("Items purchased: " + purchasedQuantity);
                System.out.println("Subtotal: $" + subTotal);

                if (subTotal >= 200) {
                    discount = (int) (subTotal * 0.15);
                    finalTotal = subTotal - discount;
                    System.out.println("You received a 15% discount!");
                    System.out.println("Discount: $" + discount);
                } else if (subTotal >= 100) {
                    discount = (int) (subTotal * 0.10);
                    finalTotal = subTotal - discount;
                    System.out.println("You received a 10% discount!");
                    System.out.println("Discount: $" + discount);
                } else {
                    discount = 0;
                    finalTotal = subTotal;
                    System.out.println("Discount: $" + discount);
                }
                System.out.println("Final total: $" + finalTotal);

                int totalPaid = 0;

                System.out.print("Enter payment amount: $");
                int payment = scanner.nextInt();

                while (payment < finalTotal) {
                    System.out.println("Insufficient payment.");
                    System.out.println("You still need to pay: $" + (finalTotal - payment));
                    System.out.print("Enter payment amount: $");
                    payment = scanner.nextInt();
                }

                System.out.println("Payment successful!");
                int change = payment - finalTotal;

                System.out.println("========================");
                System.out.println("SIMPLE STORE");
                System.out.println("========================");
                System.out.println("Items purchased: " + purchasedQuantity);
                System.out.println("Subtotal: $" + subTotal);
                System.out.println("Discount: $" + discount);
                System.out.println("Final total: $" + finalTotal);
                System.out.println("Payment: $" + totalPaid);
                System.out.println("Change: $" + change);
                System.out.println("========================");

                System.out.println("===== ITEMS PURCHASED =====");
                System.out.println("Mouse: " + mouseCount);
                System.out.println("Keyboard: " + keyboardCount);
                System.out.println("Headphones: " + headphonesCount);
                System.out.println("Laptop Stand: " + laptopCount);

                String mostPurchased = product1;
                int maxQty = mouseCount;
                if (keyboardCount > maxQty) {
                    maxQty = keyboardCount;
                    mostPurchased = product2;
                }
                if (headphonesCount > maxQty) {
                    maxQty = headphonesCount;
                    mostPurchased = product3;
                }
                if (laptopCount > maxQty) {
                    maxQty = laptopCount;
                    mostPurchased = product4;
                }
                System.out.println("Most purchased product: " + mostPurchased);
                System.out.println("Quantity: " + maxQty);
                System.out.println("========================");

                if (purchasedQuantity >= 10) {
                    System.out.println("You earned a $10 coupon for your next visit!");
                    System.out.println("========================");
                }

                System.out.println("Thank you for shopping!");
                System.out.println("========================");

                break;
            }
            else {
                System.out.println("Invalid option.\nPlease choose a number from 1 to 5.\n");
            }
        }
    }
}