package hw_from_mentor;

import java.util.Arrays;

public class CountOccurrencesOfWords {
    public static void main(String[] args) {
         /*
    This program counts the occurrences of each word in a given string. It splits the text into tokens and then counts each word using a counter.

    */
        String str = "Java is fun, and I love java.";
        String [] strArray = str.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
        String []  strArray2 =  str.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
        System.out.println(Arrays.toString(strArray2));


        for (int i=0; i < strArray.length; i++){
            int counter = 0;
            for (int j=i; j< strArray.length; j++){
                if(strArray[i].equals(strArray2[j])){
                    counter++;
                    strArray2[j] = "";
                }

            }
            if(counter >= 1){
                System.out.println(strArray[i] + " => " + counter);
            }






        }








    }


}
