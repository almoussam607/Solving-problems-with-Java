package hw_from_mentor;

import java.util.HashMap;

public class FindFirstNonRepeatedC {

    public static void main(String[] args) {

    /*This program finds the first non-repeated character in a given string.
    It iterates over the string, tracking the count of each character using a map,
    and then finds the first character with a count of one. */

        HashMap<Character, Integer> hm = new HashMap<>();
        String str = "almoussa";

        for(int i=0; i < str.length(); i++){
            if (hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }else{
                hm.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++){
            if (hm.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }



    }

}
