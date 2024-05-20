package com.exapi.string.basics;

public class StringBufferBuilder {

    // Onekgula String concatenate korte gele alada alada object hoye jay, erjonne memory o beshi lage
    // StringBuilder use korle alada object hobe na but concatenate thike hobe

    //StringBuilder thread safe * StringBuffer thread safe na
    //But eder kaj eki


    public  static  void main(String [] args){
         int a=200;
         double b=3.24;
         short c=5;
         char d='A';


         StringBuilder builder=new StringBuilder();
         builder.append(a)
                 .append("\n")
                 .append(b)
                 .append("\n")
                 .append(c)
                 .append("\n")
                 .append(d);

         String result=builder.toString();
        System.out.println(result);


        System.out.println(builder.reverse());      // last append theke return korbe
        System.out.println(builder.delete(0,1));
      //  System.out.println(builder.insert());
     //   System.out.println(builder.delete());
     //   System.out.println(builder.replace());
    }
}
