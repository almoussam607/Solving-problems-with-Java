package Interview_Questions;

public class PermutationsOfString {

    public static void main(String[] args) {
          /*This program finds all possible permutations of a given string.
        It recursively generates permutations by swapping characters at different positions within the string.
        Each permutation is then printed or stored for further processing.

        Example:
        Input: "ABC"
        Output: ABC ACB BAC BCA CAB CBA
        */

        String str = "ABC";
        char[] charArray = str.toCharArray();


        permutation(charArray,0,charArray.length-1);


    }

    public static void permutation(char[] c, int start, int end){
        if(start == end){
            System.out.println(c);
        }else{

        for (int i=start; i <= end; i++) {


            swap(c,i , start);
            permutation(c, start + 1, end);

            swap(c, i, start);
        }

        }

    }

    public static void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }




}
