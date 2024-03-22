package hw_from_mentor;

public class CountWordsInString {
    public static void main(String[] args) {

        /* This program counts the number of words in a given string.
       It splits the text based on spaces and counts the resulting tokens.*/

        String str = "Coding is not bad coding is fun.";


        String [] strArray = str.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
        System.out.println("The number of words in gaven string is " + strArray.length);



    }
}
