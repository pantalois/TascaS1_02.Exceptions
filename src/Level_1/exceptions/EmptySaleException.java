package Level_1.exceptions;


public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To make a sale you must add products first");
    }
}