package com.exapi.string.basics;

public class StringMethods {
    public static void main(String[] args) {

        //Some methods of String Operations

        String string="Hello, I am from Mars , looking for UFO";
        String string1="Bangladesh";
        String string2="USA";

        System.out.println(string.length());      //39                // return the length
        System.out.println(string.charAt(1));     //e               //find the character at index
        System.out.println(string.trim());                       //remove unnecessary space in string
        System.out.println(string.substring(1,2));  //  e            //return the characters from index to index
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());                 //set  UPPERCASE & LOWERCASE


        System.out.println(string1.indexOf("g"));   //3
        System.out.println(string1.indexOf("gl"));  //3
        System.out.println(string1.indexOf("k"));    //-1            //if not found, return -1


        // we know that the value of a & A are different in ASCII value

        System.out.println("abc".equals("ABC"));        //false
        System.out.println("abc".equals("abc"));        //true
        System.out.println("ABC".equalsIgnoreCase("abc"));      //it will return true because it ignores case sensitivity

        System.out.println(string1.contains("Mahmud"));         //false
        System.out.println(string1.contains("Bangladesh"));     //true

        System.out.println(string.replace("Mars","Saturn"));


    }
}
