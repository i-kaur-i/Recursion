import java.io.File;
import java.util.Arrays;
/**
 * This class is the driver of the FindFile class and is used
 * to find the files and to test if the code for that class
 * works.
 *
 * @author Iakjot Kaur
 * @version May 12th, 2020
 */
public class Driver
{
 /**
 * This method is the main method to test the code of the FindFile class.
 * 
 * I made a variable of the max files and then 
 * stored the files in strings and then made a new object of a file to test it.
 * Used try-catch statements to handle exceptions.
 *
 * @param: none
 * return: int
 */
   public static void main(String[] args){
    int MAX_NUMBER_OF_FILES_TO_FIND = 3;
    
    String x = "longwords.txt";
    String y = "C:\\WCW";
    
    FindFile finding = new FindFile(MAX_NUMBER_OF_FILES_TO_FIND);
    
    try{
       finding.directorySearch(x,y);
    }catch(FoundException e){
        System.out.println(finding.toString());
    }
    
    catch(Exception e){
       System.out.println("Something went wrong");
    }
    
}
}
