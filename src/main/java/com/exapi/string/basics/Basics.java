package com.exapi.string.basics;

import java.util.Date;

public class Basics {
    public static void main(String[] args) {
        System.out.println("hey");

        // there are some other way to print string

        String str=new String("I am not a good guy");
        System.out.println(str);
        char[] hello={'h','e','l','l','o'};
        String hello1=new String(hello);
        System.out.println(hello1);
        byte[] data=new byte[]{(byte)89,(byte)90,(byte)91,(byte)92,(byte)93,(byte)94,(byte)95};
        String hello2=new String(data);
        System.out.println(hello2);


        //  Every object has toString() method
        Date date=new Date();
        String string=date.toString();
        System.out.println(string);

        //For primitive data type valueOf() is used

        String one=String.valueOf(1);               //output
        System.out.println(one);                       //1
        String two=String.valueOf(2.34f);           //2.34
        System.out.println(two);
        String three=String.valueOf(false);
        System.out.println(three);                     //false
    }
}
