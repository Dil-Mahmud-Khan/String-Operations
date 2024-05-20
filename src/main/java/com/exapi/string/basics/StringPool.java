package com.exapi.string.basics;

public class StringPool {
    public static void main(String [] args){

        //String pool is a part of Heap Memory
        //String is Immutable
        // String sobsomoy string pool e save hoy, new string jodi age thekei stringpool e thake tahole ar new string create korbe na
        // ager same string er reference diye dibe,
        // Memory save hoy


        String string="abcd";
        String string1="abcd";

        String string2=new String("str");       // new operator ba constructor use korle oita pool a jay na

        String usingLiteral="str";      // in the Pool
        String newString=new String(usingLiteral);      // not in the pool


    }
}
