
/**
 * this class implements binary search to find a value in array. It uses
 * a recursive search.
 *
 * @author Iakjot Kaur
 * @version May 12th, 2020 
 */
public class BinarySearch extends SearchAlgorithm 
{   
    /**
     * This method is to search the file and find the targeted item.
     * 
     * I made variables for the highest, lowest, and the middle index. And made sure
     * the left index was larger than the right and gave the middle index a value and 
     * returned it. I compared the middle index to the word to find and stored it in
     * the values that belong to each other.
     *
     *PRE: array of words, word to find
     *POST: returns the index of the word
     * @param: string[], string
     * *return: int
     */
    public int search(String[] words, String wordToFind) throws ItemNotFoundException{
        int leftIndex = 0;
        int rightIndex = words.length -1;
        int middleIndex = 0;

        while(leftIndex >= rightIndex){
            incrementCount();
            middleIndex = (leftIndex + rightIndex) /2;

            return middleIndex;
        }
        if(words[middleIndex].compareTo(wordToFind) == 0){
            return middleIndex;
        }
        if(words[middleIndex].compareTo(wordToFind) < 0){
            rightIndex = middleIndex -1;
        }
        else if(words[middleIndex].compareTo(wordToFind) > 0){
            leftIndex = middleIndex +1;
        }
        throw new ItemNotFoundException();
    }

    /**
     * This method is to search for the targeted value with more parameters.
     * 
     * I stored the the variables and then compared the lowest index to
     * the highest and if the smallest one was less than the bigger one, then 
     * i stored the information into a variable. Then i made sure the invarients
     * where correct.
     *
     *PRE: array of words, word to find
     *POST: returns the index of the word
     * @param: string[], string
     * *return: int
     */
    public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException{
        int leftIndex = 0;
        int rightIndex = words.length -1;
        int middleIndex = (leftIndex + rightIndex) / 2;
        int index = -1; 

        if(leftIndex < rightIndex){
            index = recHelper(words, wordToFind, leftIndex, rightIndex);
        }
        else{
            throw new ItemNotFoundException();
        }

        if(index == 0){
            throw new ItemNotFoundException();
        }
        else{
            return index;
        }
    }

    /**
     * This method is to make sure the recursive works with the indexs.
     * 
     * I made sure the variables are stored, and then i comapared the middle indexes
     * with the word that is needed to find.
     *
     *PRE: array of words, word to find
     *POST: returns the index
     * @param: string[], string
     * *return: int
     */
    public int recHelper(String[] words, String wordToFind, int leftIndex, int rightIndex){
        int index = -1;
        int middleIndex = (leftIndex + rightIndex) /2;

        if(words[middleIndex].compareTo(wordToFind) == 0){
            incrementCount();
            return middleIndex;
        }

        if(words[middleIndex].equals(wordToFind)){
            incrementCount();
            return middleIndex;
        }
        else if(wordToFind.compareTo(words[middleIndex]) < 0){
            leftIndex = middleIndex + 1;
            incrementCount();

            if(leftIndex > rightIndex){
                return -1;
            }
            else{
                index = recHelper(words, wordToFind, leftIndex, rightIndex);
            }

        }
        else if(wordToFind.compareTo(words[middleIndex]) < 0){
            rightIndex = middleIndex -1;
            incrementCount();

            if(leftIndex > rightIndex){
                return -1;
            }else{
                index = recHelper(words, wordToFind, leftIndex, rightIndex);
            }
        }

        return index;
    }
}

