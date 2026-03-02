package com.practice.string;

public class StringMethodsMain {

    public static void main(String[] args) {

        char ch = 'g';
        String target = "am";
        String myString = "I am Sohail ";
        String string1 = "Apple";
        String string2 = "apple";
        String empty = " ";
        String string3 = "      Hello and good Evening !!       ";

        StringClassMethods obj = new StringClassMethods();
//------------------------------------------------------------------------------------------------------------------------------------

        char c = obj.methodCharAt(myString);
        System.out.println("The character at the 7th index is " + c);

        int i = obj.methodCodePointAt(myString);
        System.out.println("The Unicode value of the index is " + i);

        obj.methodCompareTo(string1, string2);
        obj.methodCompareToIgnoreCase(string1, string2);

        String s = obj.methodConcat("Happy ", "new ", "Year ");
        System.out.println("The concatenated String is " + s);

        boolean b = obj.methodContains(myString);
        System.out.println(b);

        boolean b1 = obj.methodContentEquals(myString);
        System.out.println(b1);

        boolean b3 = obj.methodEndsWith(myString);
        System.out.println(b3);

        boolean b4 = obj.methodEquals(myString);
        System.out.println(b4);

        boolean b5 = obj.methodEqualsIgnoreCase(myString);
        System.out.println(b5);

        obj.methodIndexOf1(myString, ch);
        System.out.println();

        obj.methodIndexOf2(myString, target);
        System.out.println();

        obj.methodIntern();
        System.out.println();

        obj.methodIsEmpty(empty);
        System.out.println();

        String lc = obj.lowerCase(myString);
        System.out.println(lc);

        String uc = obj.upperCase(myString);
        System.out.println(uc);


        obj.methodTrim(string3);
        System.out.println();


    }


}
