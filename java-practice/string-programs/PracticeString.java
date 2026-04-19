public class PracticeString {

    //------------ String questions based on methods -------------------------

    public static void main(String[] args) {

        System.out.println(reverseString("Java"));

        System.out.println(checkPalindrome("madam"));

        countVowelsConsonants("madam");

        countCase("coUnTcaSE");


    }

    // --- reverse a String
    static String reverseString(String str){

            StringBuilder sb = new StringBuilder();
            for (int i = str.length()-1; i>=0; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }



    // --- check String Palindrome
    static boolean checkPalindrome(String str){

        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().equals(str);
    }


    //--- count vowels and consonants
    static void countVowelsConsonants(String str) {
        int vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }
        System.out.println("Number of vowels : " + vowel);
        System.out.println("Number of consonants :" + (str.replaceAll(" ", "").length() - vowel));
    }


    // --- count uppercase and lowercase letters

        static void countCase(String str) {
            int upper = 0, lower = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    upper++;
                } else if (ch >= 'a' && ch <= 'z') {
                    lower++;
                }
            }

            System.out.println("Uppercase = " + upper);
            System.out.println("Lowercase = " + lower);
        }


    // check if String is Empty

    static void checkEmpty(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }

    // removing spaces from a String
    static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    // printing characters in new line
    static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    // counting digits
    static void countDigits(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }

        System.out.println("Digits = " + count);
    }


    // program to toggleCase
    static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32)); // to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32)); // to uppercase
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }



    // first unique character
    static char firstNonRepeat(String str) {

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }




}









