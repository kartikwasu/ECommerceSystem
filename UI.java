import java.util.Scanner;

public class UI {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Product[] products = {
            new Product("Phone", 29999),
            new Product("Laptop", 59999),
            new Product("Headphones", 1999)
        };

        while (true) {
            System.out.println("\nAvailable Products:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i]);
            }
            System.out.println("0. View Cart");
            System.out.println("-1. Exit");

            int choice = scanner.nextInt();
            if (choice == -1) break;
            if (choice == 0) {
                cart.viewCart();
            } else if (choice > 0 && choice <= products.length) {
                cart.addProduct(products[choice - 1]);
                System.out.println("Product added to cart.");
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
        System.out.println("Thank you for using the E-Commerce System!");
    }
}