
/**
 * This class is used to print an exception that extends the
 * Exception class.
 *
 * @author Iakjot Kaur
 * @version May 12th, 2020
 */
public class FoundException extends Exception
{   /**
     * This constructor is to print the message of the file not
     * being found. 
     * 
     * I printed out the message needed when the files are not found.
     *
     *PRE: nothing
     *POST: a message
     * @param: none
     * *return: none
     */
    public FoundException(){
       super("maximum number of files are found");
    }
    
    /**
     * This constructor is for the FoundFilesException that is not empty.
     * 
     * I just printed the string.
     *
     *PRE: nothing 
     *POST: message
     * @param: string
     * *return: none
     */
    public FoundException(String x){
       super(x);
    }
}
