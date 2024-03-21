package hw_from_mentor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurrencesOfChar {
    public static void main(String[] args) {
        /*This program counts the occurrences of each character in a given string.
        It iterates over the string and maintains a count of each character using a map.
        */

        HashMap<Character, Integer> hm = new HashMap<>();
        String str = "almoussa.";
        str = str.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        System.out.println(str);

        for(int i=0; i < str.length(); i++){
            if (hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }else{
                hm.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
