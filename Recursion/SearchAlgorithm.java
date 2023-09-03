/**
 *
 * SearchAlgorithm
 *    A class used to delegate a search strategy or style
 *
 * @author: originally by cfolsen, this version modified by rnash
 */
public abstract class SearchAlgorithm {
    /**
     * Method search: a "to-be-defined" method used to implement a specific
    search strategy over the given array looking for the target word
     * Precondition: words is a nonempty array and target is a non-null string
     * Postcondition: if the target word is found, return its index. 
     *                If not found, throw an ItemNotFoundException (a subclass
    which you have to make)
     *
     */
    public abstract int search(String[] words, String wordToFind) throws
    ItemNotFoundException;
    

    public abstract int recSearch(String[] words, String wordToFind) throws
    ItemNotFoundException;
    /**
     * Utility Features: This class can be used to track the number of search
    comparisons
     *for use in comparing two different search algorithms
     */
    private int count = 0;
    public void incrementCount() {
        count++;
    }
    
     /**
     * This method is to get the count.
     * 
     * I returned the count variable.
     *
     *PRE: nothing
     *POST: returns the count
     * @param: none
     * *return: int
     */
    public int getCount() {
        return count;
    }
    
     /**
     * This method is to reset the count.
     * 
     * this resets the count of the files.
     *
     *PRE: nothing
     *POST: resets the count 
     * @param: none
     * *return: none
     */
    public void resetCount() {
        count = 0;
    }
}

