package com.exapi.string.basics;

public class concatenation {
    public static void main(String[] args) {

        // concat()
        String string1="hello";
        String string2="dil";
        String s= string1.concat(string2);
        System.out.println(s);


        // + operator
        String s2="Hello"+string1;
        System.out.println(s2);

        System.out.println("a"+"b");                //ab
        System.out.println("a"+"b"+"c"+12);         //abc12
        System.out.println(1+2+"c");                //3c



    }
}
