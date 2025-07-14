package Level_2.exceptions;

public class EmptyLineException extends Exception{
    public EmptyLineException(){
        super("The line must not be empty");
    }
}
