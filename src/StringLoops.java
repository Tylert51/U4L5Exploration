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

    public int countString(String searchString, String origString)
    {
        int numTimes = 0;
        String lowerCaseString = origString.toLowerCase();
        String searchStringLower = searchString.toLowerCase();

        int i = 0;
        int index = 0;
        String newString = lowerCaseString;
        while (index != -1) {
            newString = newString.substring(i);
            index = newString.indexOf(searchStringLower);

            if (newString.contains(searchStringLower)) {
                numTimes++;
                i = index + 1;
            }
        }
        return numTimes;
    }

    public String removeString(String searchString, String origString)
    {
        int i = origString.indexOf(searchString);
        String updatedStr = origString;
        int searchStrLength = searchString.length();
        while (i != -1) {
            updatedStr = updatedStr.substring(0,i) + updatedStr.substring(i + searchStrLength);
            i = updatedStr.indexOf(searchString);
        }
        return updatedStr;
    }

    public String replaceCharacter(String searchChar, String origStr, String replaceChar)
    {
        String updatedStr = "";
        for (int i = 0; i < origStr.length(); i++) {
            String orgStrLetter = origStr.charAt(i) + "";
            if (orgStrLetter.equals(searchChar)) {
                updatedStr += replaceChar;
            } else {
                updatedStr += orgStrLetter;
            }
        }
        return updatedStr;
    }
}