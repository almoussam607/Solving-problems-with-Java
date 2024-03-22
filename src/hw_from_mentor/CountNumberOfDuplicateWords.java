package hw_from_mentor;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfDuplicateWords {
    public static void main(String[] args) {
        /* This program counts the number of duplicate words in a given string.
    It tokenizes the text into words and then tracks how many times each word appears using a map.*/


        HashMap<String, Integer> hm = new HashMap<>();

        String str = "Coding is not bad coding is fun.";


        String [] strArray = str.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");

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
                System.out.println(enter.getKey() + " => " + enter.getValue());


        }




    }
}
