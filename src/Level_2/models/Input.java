package Level_2.models;
import java.util.InputMismatchException;
import java.util.Scanner;
import Level_2.exceptions.*;
import Level_2.exceptions.StringException;


public class Input {
    private static Scanner scanner = new Scanner(System.in);


    public static byte readByte(String messageToUser) {
        System.out.println(messageToUser);
        while (true) {
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Error: the entered data is not a byte, please, type a number between -128 and 127.");
                scanner.next();
            }
        }
    }

    public static int readInt(String messageToUser){
        System.out.println(messageToUser);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Formatting error, please, type an int.");
                scanner.next();
            }
        }
    }

    public static float readFloat(String messageToUser){
        System.out.println(messageToUser);
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Formatting error, please type, a float.");
                scanner.next();
            }
        }
    }

    public static double readDouble(String messageToUser){
        System.out.println(messageToUser);
        while (true) {
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Formatting error, please, type a double.");
                scanner.next();
            }
        }
    }


    public static char readChar (String messageToUser){
        System.out.println(messageToUser);
        while (true) {
            try {
                String charValue = scanner.nextLine();
                if (charValue.isEmpty()) {
                    throw new EmptyLineException();
                }
                if (charValue.length() == 1) {
                    return charValue.charAt(0);
                } else {
                    throw new CharException();
                }
            } catch (CharException | EmptyLineException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString (String messageToUser) {
        System.out.println(messageToUser);
        while (true) {
            try {
                String response = scanner.nextLine();
                if (response.isEmpty()) {
                    throw new EmptyLineException();
                }
                if (response.trim().length() == 1) {
                    throw new StringException();
                }
                return response;
            } catch (EmptyLineException | StringException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public static boolean readYesNo (String messageToUser){
        System.out.println(messageToUser);
        while (true) {
            try {
                String yesNo = scanner.nextLine().trim().toLowerCase();
                if (yesNo.isEmpty()) {
                    throw new EmptyLineException();
                }
                if (yesNo.equals("n")) {
                    return false;
                } else if (yesNo.equals("s")) {
                    return true;
                } else {
                    throw new YesNoException();
                }
            } catch (YesNoException | EmptyLineException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void closeScanner(){
        scanner.close();
    }
}