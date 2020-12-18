import java.sql.Array;
import java.util.ArrayList;

public class kursova {

    public static void getResult(Integer input){
        // get the list of numbers
        ArrayList<Integer> arrayList = getNumbe rs(input);
        // array for adding the results
        ArrayList<Integer> arrayResult = new ArrayList<>();

        //create a for/while loop to check for the sum and keep track of the numbers used
        //if answer found add them to the list

        //print out the number of digits used
        System.out.println(arrayResult.size());
        //print out the number found for the sum of the number
        System.out.println(arrayResult.toString());
    }


    public static ArrayList<Integer> getNumbers(Integer input){
        // get number of digits in the input
        int length = (int) (Math.log10(input) + 1);
        //declare an empty array of ints and later on add values to it
        ArrayList<Integer> digitsToBeUsedForResult = new ArrayList<>();

        // go over number of digits -1
        // for number 13332 it will always contain every number like 1/11/111/1111 to 9/99/999/9999
        // add those + 11111 for 13332 by checking the first and second digit of the input
        for (int i = 0; i<length-1; i++){

        }

        // returning null for now but here return the List to be used in the getResult method
        return null;
    }

    // for checking if method works
    public static void main(String[] args) {
        getResult(15524);
        getResult(98273192);
        getResult(13332);
        getResult(150000);
        getResult(167890);
        getResult(5543);
        getResult(333);
    }
}
