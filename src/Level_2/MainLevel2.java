package Level_2;
import java.util.*;
import Level_2.models.Input;
import java.util.Scanner;

public class MainLevel2 {

    public static void main(String[] args) throws Exception {
        Scanner menuScanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Choose an Input Type ---");
            System.out.println("1. Read a Byte");
            System.out.println("2. Read an Int");
            System.out.println("3. Read a Float");
            System.out.println("4. Read a Double");
            System.out.println("5. Read a Char");
            System.out.println("6. Read a String");
            System.out.println("7. Read Yes/No");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = menuScanner.nextInt();

                switch (choice) {
                    case 1:
                        byte byteValue = Input.readByte("Type a byte:");
                        if (byteValue != -1) {
                            System.out.println("The byte value is: " + byteValue);
                        }
                        break;
                    case 2:
                        int intValue = Input.readInt("Type an int:");
                        if (intValue != -1) {
                            System.out.println("The int value is: " + intValue);
                        }
                        break;
                    case 3:
                        float floatValue = Input.readFloat("Type a float:");
                        if (floatValue != -1.0f) {
                            System.out.println("The float value is: " + floatValue);
                        }
                        break;
                    case 4:
                        double doubleValue = Input.readDouble("Type a double:");
                        if (doubleValue != -1.0) {
                            System.out.println("The double value is: " + doubleValue);
                        }
                        break;
                    case 5:
                       try{
                           char charValue = Input.readChar("Type a character:");
                           System.out.println("The character is: " + charValue);
                       }catch (Exception e){
                           System.out.println(e.getMessage());
                       }
                        break;
                    case 6:
                       try {
                           String stringValue = Input.readString("Type a string:");
                           System.out.println("The string is: \"" + stringValue + "\"");
                       }catch (Exception e){
                           System.out.println(e.getMessage());
                       }
                        break;
                    case 7:
                        try{
                            boolean yesNoValue = Input.readYesNo("Type 'yes' or 'no':");
                            System.out.println("You entered: " + (yesNoValue ? "Yes" : "No"));
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 0:
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 0 and 7.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                menuScanner.next();
                choice = -1;
            }
        } while (choice != 0);

        menuScanner.close();
    }
}
