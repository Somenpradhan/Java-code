import java.util.ArrayList;
import java.util.Scanner;

// Product Class
class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    // Constructor
    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display Product Details
    
    public String toString() {
        return String.format("ID: %d, Name: %s, Quantity: %d, Price: $%.2f", id, name, quantity, price);
    }
}

// Inventory Management System Class
public class InventoryManagementSystem {
    private ArrayList<Product> inventory = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a New Product
    public void addProduct() {
        try {
            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Check for duplicate ID
            if (findProductById(id) != null) {
                System.out.println("Product ID already exists. Please use a different ID.");
                return;
            }

            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            inventory.add(new Product(id, name, quantity, price));
            System.out.println("Product added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the correct data.");
            scanner.nextLine(); // Clear the scanner buffer
        }
    }

    // View All Products
    public void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("Current Inventory:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    // Search Product by ID or Name
    public void searchProduct() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory to search.");
            return;
        }

        System.out.println("Search by: 1. ID  2. Name");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            Product product = findProductById(id);
            if (product != null) {
                System.out.println(product);
            } else {
                System.out.println("Product not found.");
            }
        } else if (choice == 2) {
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            Product product = findProductByName(name);
            if (product != null) {
                System.out.println(product);
            } else {
                System.out.println("Product not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Update an Existing Product
    public void updateProduct() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory to update.");
            return;
        }

        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();
        Product product = findProductById(id);

        if (product != null) {
            try {
                System.out.print("Enter new Quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter new Price: ");
                double price = scanner.nextDouble();
                product.setQuantity(quantity);
                product.setPrice(price);
                System.out.println("Product updated successfully!");
            } catch (Exception e) {
                System.out.println("Invalid input. Update failed.");
                scanner.nextLine(); // Clear the scanner buffer
            }
        } else {
            System.out.println("Product not found.");
        }
    }

    // Remove a Product
    public void removeProduct() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory to remove.");
            return;
        }

        System.out.print("Enter Product ID to remove: ");
        int id = scanner.nextInt();
        Product product = findProductById(id);

        if (product != null) {
            inventory.remove(product);
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Calculate Total Inventory Value
    public void calculateTotalValue() {
        double totalValue = 0;
        for (Product product : inventory) {
            totalValue += product.getQuantity() * product.getPrice();
        }
        System.out.printf("Total Inventory Value: $%.2f%n", totalValue);
    }

    // Find Product by ID
    private Product findProductById(int id) {
        for (Product product : inventory) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Find Product by Name
    private Product findProductByName(String name) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Display Menu
    public void showMenu() {
        int choice;
        do {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Remove Product");
            System.out.println("6. Calculate Total Value");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    removeProduct();
                    break;
                case 6:
                    calculateTotalValue();
                    break;
                case 7:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    // Main Method
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.showMenu();
        ims.scanner.close(); // Close the scanner
    }
}