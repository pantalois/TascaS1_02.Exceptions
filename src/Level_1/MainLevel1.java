package Level_1;

import java.util.Scanner;
public class MainLevel1 {

    public static void main(String[] args) {

        boolean program = true;
        Scanner scanner = new Scanner(System.in);
        Sale sale = new Sale();
        while (program) {
            System.out.println("What do you want to do?\n" +
                    "1.Add product\n" +
                    "2.Calculate price of a single product\n" +
                    "3.Calculate total price\n" +
                    "4.Exit\n");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter product price: ");
                        double price = scanner.nextDouble();
                        sale.addItem(new Product(name, price));
                        break;
                    case 2:
                        try {
                            sale.getPrice();}
                        catch (EmptySaleException | IndexOutOfBoundsException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try{
                            sale.calculateTotalPrice();
                        }
                        catch (EmptySaleException | IndexOutOfBoundsException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        program = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please between 1-4.");
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input. Please enter a number (1-5).");
                scanner.nextLine();
            }
        }
    }
}

