package Level_2.models;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public Input(){
        scanner = new Scanner(System.in);
    }

    public static byte readByte(String messageToUser){
        System.out.println(messageToUser);
        try {
            return scanner.nextByte();
        }
        catch(InputMismatchException e){
            System.out.println("Error: the entered data is not a byte");
            scanner.next();
            return -1;
        }
    }

    public static int readInt(String messageToUser){
        System.out.println(messageToUser);
        try {
            return scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error: the entered data is not an int");
            scanner.next();
            return -1;
        }

    }
    public static float readFloat(String messageToUser){
        System.out.println(messageToUser);
        try {
            return scanner.nextFloat();
        } catch(InputMismatchException e) {
            System.out.println("Error: The entered data is not a float.");
            scanner.next();
            return -1.0f;
        }
    }
    public static double readDouble(String messageToUser){
        System.out.println(messageToUser);
        try {
            return scanner.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("Error: The entered data is not a double.");
            scanner.next();
            return -1.0;
        }
    }


    public static char readChar (String messageToUser)throws Exception{
        System.out.println(messageToUser);
        String charValue = scanner.nextLine();
        if(charValue.length() == 1){
            return charValue.charAt(0);
        }
        else{
            throw new Exception("Error: the entered data is not a char");
        }
    }

    public static String readString (String messageToUser)throws Exception{
        System.out.println(messageToUser);
        try{
            return scanner.nextLine();
        }catch(InputMismatchException e){
            throw new Exception("Error: the entered data is not a string");
        }
    }

    public static boolean readYesNo (String messageToUser)throws Exception{
        System.out.println(messageToUser);
        String yesNo = scanner.nextLine();
        if(yesNo.equals("No") || yesNo.equals("n") || yesNo.equals("N")){
            return false;
        } else if (yesNo.equals("Yes")|| yesNo.equals("y") || yesNo.equals("Y")) {
            return true;
        }
        else{
            throw new Exception("Error: the entered data is not a boolean");
        }
    }




}