package Warmup_1;



public class StringTimes {
        /*
        Given a string and a non-negative int n, return a larger string that is n copies of the original string.


        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi" */


    public static String stringTimes(String str, int n) {
        String str1 = "";
        for(int i=0; i < n; i++ ){
            str1 = str1 + str;
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("I love coding", 5));
    }



}
