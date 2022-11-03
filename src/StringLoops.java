import java.util.Locale;

public class StringLoops
{
    public StringLoops() { }

    public int countCharacters(String character, String searchString)
    {
        int numTimes = 0;
        for (int i = 0; i < searchString.length(); i++) {
            String searchSub = searchString.substring(i, i + 1);
            if (searchSub.compareTo(character) == 0) {
                numTimes++;
            }
        }
        return numTimes;
    }

    public String reverseString(String origString)
    {
        String reverse = "";
        for (int i = origString.length(); i > 0; i--) {
            reverse += origString.substring(i-1, i);
        }
        return reverse;
    }

    public String reverseString2(String origString) {
        String reverse = "";
        for (int i = 0; i < origString.length(); i++) {
            reverse = origString.substring(i, i + 1) + reverse;
        }
        return reverse;
    }

    public int countVowels(String origString)
    {
        int vowels = 0;
        String allVowels = "aeiouAEIOU";
        for (int i = 0; i < origString.length(); i++) {
            String letter = origString.charAt(i) + "";
            if (allVowels.contains(letter)) {
                vowels++;
            }
        }
        return vowels;
    }

    /* Returns the number of times "searchString" appears in "origString";
     matches should NOT be case sensitive.

     Examples:
     - if searchString = "an" and origString = "Apples and bananas",
       this method returns 3: Apples and bananas
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns 3: Ratatattat (note that two overlap)
     - if searchString = "lower" and origString = "sunflower",
       this method returns 1: sunflower
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns 4: Hahahahaha
 (note that two overlap)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns 4: Hahahahaha (note that two overlap)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns 3: it’s the brain drain pain train
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns 2
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns 0
     - if searchString = "i" and origString = "Supercalifragilisticexpialidocious",
       this method returns 7
    */
    public int countString(String searchString, String origString)
    {
        int numTimes = 0;
        String lowerCaseString = origString.toLowerCase();

        int i = 0;
        int index = 0;
        while (index != -1) {
            String newString = lowerCaseString.substring(i);
            index = lowerCaseString.indexOf(searchString);

            if (newString.contains(searchString)) {
                numTimes++;
                i = index + 1;
            }
        }
        return numTimes;
    }


}
