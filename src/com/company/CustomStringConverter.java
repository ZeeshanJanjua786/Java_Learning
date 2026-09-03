package com.company;
public class CustomStringConverter {
    public static String myToUpperCase(String value){
     if (value == null ) return null;
     char[] singleChar = value.toCharArray();
     for (int i = 0; i < singleChar.length; i++){
         if (singleChar[i]>='a' && singleChar[i] <= 'z'){
             singleChar[i] = (char) (singleChar[i]-32);
         }

     }
     return new String(singleChar);

    }
    //lower case
    public static String myToLowerCase(String value){
        if (value == null ) return null;
        char[] singleChar = value.toCharArray();
        for (int i = 0; i < singleChar.length; i++){
            if (singleChar[i]>='A' && singleChar[i] <= 'Z'){
                singleChar[i] = (char) (singleChar[i] + 32);
            }

        }
        return new String(singleChar);

    }
    public static void main(String[] args){
        String name = "Zeeshan";
        System.out.println("before: " + name);
        System.out.println("after upper: " + myToUpperCase(name));
        System.out.println("after lower: " + myToLowerCase(name));
    }
}