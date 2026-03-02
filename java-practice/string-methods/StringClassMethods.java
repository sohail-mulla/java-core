package com.practice.string;

public class StringClassMethods {

    char methodCharAt(String str) {

        char index = str.charAt(7);     // chartAt() method which gives the character at a specified index of a string
        return index;
    }
//-----------------------------------------------------------------------------------------------------------------------------------

    int methodCodePointAt(String str) { // codePointAt() method returns the Unicode value of the given index of String

        return str.codePointAt(7);
    }
//-----------------------------------------------------------------------------------------------------------------------------------

    void methodCompareTo(String str1, String str2) {

        int result = str1.compareTo(str2);       // ( .compareTo() checks lexicographically and returns neg, pos or zero
        if (result < 0) System.out.println(str1 + " comes before " + str2);
        if (result > 0) System.out.println(str1 + " comes after " + str2);
        if (result == 0) System.out.println("Both the words are same ");

    }

    public void methodCompareToIgnoreCase(String str1, String str2) {

        int result = str1.compareToIgnoreCase(str2);   // same but without case consideration
        if (result < 0) System.out.println(str1 + " comes before " + str2);
        if (result > 0) System.out.println(str1 + " comes after " + str2);
        if (result == 0) System.out.println("Both the words are same ");

    }
//-----------------------------------------------------------------------------------------------------------------------------------


    String methodConcat(String str1, String str2, String str3) {
        // concat() concats 2 or more strings, it doesnt concat other datatypes like int
        return str1.concat(str2).concat(str3);    // unlike + operator which can concat int with String , etc.
    }

//-----------------------------------------------------------------------------------------------------------------------------------

    boolean methodContains(String str) {

        if (str.contains("Hi")) return true;  // contains() method checks if string contains a sequence of characters
        else return false;                     // or a single letter
    }


    boolean methodContentEquals(String str) {  // contentEquals() Checks whether a string contains the
                                               // exact same sequence of characters
        if (str.contentEquals("Hello"))
            return true;                    //  used with any sequence of characters (String , StringBuilder etc)
        else return false;                   // equals() is used with String only
    }

//-----------------------------------------------------------------------------------------------------------------------------------

    boolean methodEndsWith(String str) {  // endsWith() checks the end part

        if (str.endsWith("l")) return true;
        else return false;

    }



    boolean methodStartsWith(String str) {  // startsWith() checks the start part

        if (str.startsWith("S")) return true;
        else return false;

    }


//-----------------------------------------------------------------------------------------------------------------------------------

    boolean methodEquals(String str) {  // equals() method --> Content Comparison

        String str2 = "Hello";
        if (str.equals(str2)) return true;
        else return false;
    }


    boolean methodEqualsIgnoreCase(String str) {  // equals() method --> Content Comparison
        String str2 = "i am sohail ";
        if (str.equalsIgnoreCase(str2)) return true;
        else return false;
    }
//-----------------------------------------------------------------------------------------------------------------------------------

    void methodIndexOf1(String str,char ch){

        int index = str.indexOf(ch);
        if (index != -1)
            System.out.println(ch + " found at index "+ index);
        else
            System.out.println(ch +" not found ! ");
    }


    void methodIndexOf2(String str,String target){

        int index = str.indexOf(target);
        if (index != -1)
            System.out.println("\'"+target+"\'" + " found at index " + index);
        else
            System.out.println("\'"+target+"\'" +" not found ! ");
    }

//-----------------------------------------------------------------------------------------------------------------------------------

    void methodIntern(){

       String m = new String("Java");
       String n = "Java";
       System.out.println(m == n);
       String k = m.intern();  // intern() method transfers the String from Heap --> Pool if the "string" is present in heap n not in pool
       System.out.println(k == n); // If the "string" is already present in pool the m.intern checks and returns address of pool. 
                                   // But to change pointing of m from heap to pool you will have to save it in a new String.


    }

//-----------------------------------------------------------------------------------------------------------------------------------

    void methodIsEmpty(String str) {
        if (str.isEmpty()) System.out.println("This String is empty ");
        else System.out.println("This String is NOT empty ");

    }
//-----------------------------------------------------------------------------------------------------------------------------------

    String lowerCase(String str){

        return str.toLowerCase();
    }

    String upperCase(String str){

        return str.toUpperCase();
    }
//-----------------------------------------------------------------------------------------------------------------------------------

    void methodTrim(String str){ // The trim() method removes whitespace from both "ends" of a string, 'ends' not in between spaces
                                // // Use strip(): For modern, internationalized applications
        System.out.println(str);
        System.out.println("Length : "+ str.length()) ;  // trim() ---> old
        str = str.trim();                                // strip() ---> new --> USE THIS ONLY*
        System.out.println(str);
        System.out.println("Length after trim : "+ str.length());

    }

//-----------------------------------------------------------------------------------------------------------------------------------

    void methodIsBlank(String str) {
        // isBlank() is used mostly than isEmpty(),isEmpty returns false when string is blank and isEmpty() has spaces
        if (str.isBlank()) System.out.println("This String is Blank ");
        else System.out.println("This String is NOT Blank ");

    }

}


