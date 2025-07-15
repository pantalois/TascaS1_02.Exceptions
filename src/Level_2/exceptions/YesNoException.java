package Level_2.exceptions;

public class YesNoException extends Exception {
    public YesNoException(){
        super("Please, type 's' or 'n':");
    }

}
