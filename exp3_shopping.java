import java.util.Scanner;
import java.util.Vector;

public class exp3_shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> shoppingList = new Vector<>();

        while (true) {
            System.out.println("\nShopping List Operations:");
            System.out.println("1. Add an item");
            System.out.println("2. Add an item at a specified location");
            System.out.println("3. Delete an item");
            System.out.println("4. Print the contents of the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    shoppingList.add(newItem);
                    System.out.println("'" + newItem + "' added to the list.");
                    break;

                case 2:
                    System.out.print("Enter the location to add the item: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (index >= 0 && index <= shoppingList.size()) {
                        System.out.print("Enter the item to add: ");
                        String itemAtIndex = scanner.nextLine();
                        shoppingList.add(index, itemAtIndex);
                        System.out.println("'" + itemAtIndex + "' added at index " + index + ".");
                    } else {
                        System.out.println("Invalid index! The item was not added.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the item to delete: ");
                    String itemToDelete = scanner.nextLine();
                    if (shoppingList.remove(itemToDelete)) {
                        System.out.println("'" + itemToDelete + "' deleted from the list.");
                    } else {
                        System.out.println("'" + itemToDelete + "' not found in the list.");
                    }
                    break;

                case 4:
                    if (shoppingList.isEmpty()) {
                        System.out.println("The shopping list is empty.");
                    } else {
                        System.out.println("Contents of the shopping list:");
                        for (String item : shoppingList) {
                            System.out.println("- " + item);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting the shopping list application.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
