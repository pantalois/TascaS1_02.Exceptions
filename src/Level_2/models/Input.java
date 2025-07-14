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
                System.out.println("Formatting error.");
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
                System.out.println("Formatting error.");
                scanner.next();
            }
        }
    }

    public static double readDouble(String messageToUser){
        System.out.println(messageToUser);
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Formatting error.");
                scanner.next();
            }
        }
    }


    public static char readChar (String messageToUser) throws CharException{
        System.out.println(messageToUser);
        String charValue = scanner.nextLine();
        if(charValue.length() == 1){
            return charValue.charAt(0);
        }
        else{
            throw new CharException();
        }
    }

    public static String readString (String messageToUser) throws Exception {
        System.out.println(messageToUser);
        String response = "";
        while (true) {
            try {
                response = scanner.nextLine();
                if (response.isEmpty()) {
                    throw new EmptyLineException();
                }
            } catch (InputMismatchException | EmptyLineException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readYesNo (String messageToUser)throws YesNoException{
        System.out.println(messageToUser);
        String yesNo = scanner.nextLine();
        if(yesNo.equals("n")){
            return false;
        } else if (yesNo.equals("s")) {
            return true;
        }
        else{
            throw new YesNoException();
        }
    }




}