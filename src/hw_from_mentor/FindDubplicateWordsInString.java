package hw_from_mentor;

import java.util.HashMap;
import java.util.Map;

public class FindDubplicateWordsInString {
    public static void main(String[] args) {

    /*This program finds duplicate words in a given string.
    It tokenizes the string into words and then tracks the count of each word using a map.
    Words with a count greater than one are identified as duplicates.*/

        HashMap<String, Integer> hm = new HashMap<>();

        String str = "Coding is not bad coding is fun.";


      String [] strArray = str.toLowerCase().split(" ");

        System.out.println(strArray[0]);

        for (int i=0; i < strArray.length; i++){
            if(hm.containsKey(strArray[i])){
                hm.put(strArray[i], hm.get(strArray[i]) + 1);
            }else{
                hm.put(strArray[i], 1);

            }
        }
        System.out.println(hm);

        for (Map.Entry<String, Integer> enter: hm.entrySet()){
            if (enter.getValue() > 1){
                System.out.println("There are " + enter.getValue() + " times of " + enter.getKey());
            }
        }






    }
}
