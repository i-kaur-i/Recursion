
/**
 * This class is to print out an exception that extends the exception class.
 * This exception is for the search algorithm.
 *
 * @author Iakjot Kaur
 * @version May 12th, 2020
 */
public class ItemNotFoundException extends Exception
{   
     /**
     * This constructor is to print out the message.
     * 
     * I printed out the message needed.
     *
     *PRE: nothing
     *POST: message 
     * @param: none
     * *return: none
     */
    public ItemNotFoundException(){
       super("Item not found");
    }
    
     /**
     * This constructor is to print the message if it isn't empty.
     * 
     * I printed the string passed in.
     *
     *PRE: nothing
     *POST: message
     * @param: string
     * *return: none
     */
    public ItemNotFoundException(String x){
       super(x);
    }
}
