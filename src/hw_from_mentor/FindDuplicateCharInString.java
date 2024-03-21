package hw_from_mentor;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharInString {

    public static void main(String[] args) {


        /*This program finds duplicate characters in a given string.
        It iterates over the string and maintains a count of each character using a map.
        Then, it identifies characters with a count greater than one as duplicates.
         */

        HashMap<Character, Integer> hm = new HashMap<>();

        String str = "almoussa";
        str = str.toLowerCase();

        for (int i=0; i < str.length(); i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            }else{
                hm.put(str.charAt(i), 1);
            }
        }
        System.out.println(hm);



      for (Map.Entry<Character, Integer>  enter : hm.entrySet()){
          if (enter.getValue() > 1){
              System.out.println("There are " + enter.getValue() + " times of " + enter.getKey());

          }

      }

    }
}
