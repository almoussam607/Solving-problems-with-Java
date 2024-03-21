package hw_from_mentor;

public class FindAllPermutaionsOfString {

    public static void main(String[] args) {
        /*This program finds all possible permutations of a given string.
        It recursively generates permutations by swapping characters at different positions within the string.
        Each permutation is then printed or stored for further processing.
        */

        String str = "abc";
        char[] chars = str.toCharArray();
        System.out.println("chars = " + chars);
        System.out.println("Permutations of " + str + ":");
        permutations(chars, 0, chars.length - 1);
    }

    public static void permutations(char[] chars, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            System.out.println(String.valueOf(chars));
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                swap(chars, startIndex, i);
                permutations(chars, startIndex + 1, endIndex);
                swap(chars, startIndex, i); // Backtrack: restore the original order of characters
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
