
/**
 * The class LinearSearch extends the SearchAlgorithm class. It is used
 * to find a value in an array. The ItemNotFoundException made and used SearchAlgorithm
 * to implement a linear search.
 *
 * @author Iakjot Kaur
 * @version May 12, 2020
 */
public class LinearSearch extends SearchAlgorithm
{ 
    /**
     * This method is to search the array to find the word we are looking for.
     * 
     * I used a for loop to loop through the array and if the word is found
     * and then returned the index of where it is at.
     *
     *PRE: array of words, target to find
     *POST: returns the index of where the word is located
     * @param: string[], string
     * *return: int
     */
    public int search(String[] words, String wordToFind) throws ItemNotFoundException{
        for(int i=0; i < words.length; i++){
            incrementCount();
            if(words[i].equals(wordToFind)){
                return i;
            }
        }
        throw new ItemNotFoundException();
    }

    /**
     * This method is to take care of a possible error. 
     * 
     * If the length is zero then I throw an exception. I returned the index
     * of the word is found and incremented the index if not.
     *
     *PRE: array of words, word to find
     *POST: returns the index of the word
     * @param: string[], string
     * *return: int
     */
    public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException{
        int index = 0;
        if(words.length == 0){
            throw new ItemNotFoundException();
        }else{
            if(words[index].equals(wordToFind)){
                return index;
            }else{
                index++;
                recSearch(words,wordToFind);
            }
        }
        return index;
    }
}
