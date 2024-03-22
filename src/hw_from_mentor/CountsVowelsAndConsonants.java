package hw_from_mentor;

public class CountsVowelsAndConsonants {
    public static void main(String[] args) {

        /*This program counts the number of vowels and consonants in a given string.
        It iterates over the string and checks whether each character is a vowel or a consonant,
        incrementing respective counters accordingly.*/

        String str = "Almou,ssa4 .";
        str = str.toLowerCase().replaceAll("[^a-z+]+", "");
        System.out.println(str);

        int vowelsCounter = 0, consonantsCounter = 0;


        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i') {
              vowelsCounter++;
            }else{
                consonantsCounter++;
            }
        }
        System.out.println("Vowels => "+ vowelsCounter);
        System.out.println("Consonants => "+ consonantsCounter);
    }
}
