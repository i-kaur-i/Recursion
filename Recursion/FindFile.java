import java.io.File;
import java.util.Arrays;
/**
 * This class is to serach for the file in the dicrectory by
 * using recursion.
 *
 * @author Iakjot Kaur
 * @version May 12th, 2020
 */
public class FindFile
{   
    // instance variables 
    private int maxFiles;
    private int count;
    private String[] Filenames;
    private String target;

    /**
     * This constructor is to take the maximum number of files.
     * 
     * I passed in the maxFiles to initalize it and set the count to zero
     * to begin. I stored the files into the array of files.
     *
     *PRE: number of files
     *POST: initalizes the variables
     * @param: int
     * *return: none
     */
    public FindFile(int maxFiles){
        this.count = 0;
        this.maxFiles = maxFiles;
        this.Filenames = new String[maxFiles];
    }

    /**
     * This method is to search for the file when the directory is given.
     * 
     * I made a new file and stored it into the file array. Then I looped through
     * the files and checked if the name is equal to the target, and if it is,
     * then I get the path of the file and increment the count. If the file is in the 
     * directory then I use recursion to get the target and path of the file. Then used
     * invarients to throw the exceptions.
     *
     *PRE: file, directory, and target
     *POST: finds the target
     * @param: string
     * *return: none
     */
    public void directorySearch(String target, String dirName) throws FoundException{
        File f = new File(dirName);
        File[] numFiles = new File(dirName).listFiles();
        for(File files: numFiles){
            if(files.getName().equals(target)){
                Filenames[count] = f.getAbsolutePath();
                this.count++;
            }else if(f.isDirectory() == true){
                directorySearch(target,f.getAbsolutePath());
            }
            else if(this.count == this.maxFiles){
                throw new FoundException();
            }
            if(f.exists() != true){
                throw new IllegalArgumentException();
            }
        }

    }

    /**
     * This method is to get the count.
     * 
     * I returned the count of the instance variable.
     *
     *PRE: count variable
     *POST: returns the count
     * @param: none
     * *return: int
     */
    public int getCount(){
        return this.count;
    }

    /**
     * This method is to get the string files.
     * 
     * I returned the files from the instance variables.
     *
     *PRE: array 
     *POST: returns the array of file names
     * @param: none
     * *return: String[]
     */
    public String[] getFilenames(){
        return this.Filenames;
    }

    /**
     * This method is to get the maximum number of files.
     * 
     * I returned the instance variable of the maxFiles.
     *
     *PRE: variable for max files
     *POST: returns the max files
     * @param: none
     * *return: int
     */
    public int getMaxFiles(){
        return this.maxFiles;
    }

    /**
     * This method is to print out the files.
     * 
     * I checked if the count isn't 0 and then looped through the array
     * to get the file names.
     *
     *PRE: nothing
     *POST: returns a string of the files
     * @param: none
     * *return: String
     */
    public String toString(){
        String checking = "";
        if(this.getCount() != 0){
            for(int i=0; i< this.getFilenames().length; i++){
                checking = " \n " + this.getFilenames()[i];
            }
        } else{
            checking = "file not found";
        }
        return checking;
    }
}
