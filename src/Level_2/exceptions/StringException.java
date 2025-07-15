
package Level_2.exceptions;

public class StringException extends Exception{
    public StringException(){
        super("String format error, type at least two characters");
    }
}