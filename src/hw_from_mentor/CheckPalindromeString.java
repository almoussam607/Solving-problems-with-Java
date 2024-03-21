package hw_from_mentor;

public class CheckPalindromeString {
    public static void main(String[] args) {

    /* This program checks whether a given string is a palindrome or not.
     It compares characters from the beginning and end of the string, moving towards the middle, and if all characters match,
     it declares the string as a palindrome.
     */

        String str = "level";
        boolean check = true;

        for (int i=0; i < str.length()/2; i++){
            check = str.charAt(i) == str.charAt((str.length() - 1) - i);
        }

        if (check){
            System.out.println("The string you gave is a palindrome!");
        }else{
            System.out.println("The string you gave is NOT a palindrome!");
        }


    }
}
