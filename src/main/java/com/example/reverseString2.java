package com.example;

public class reverseString2 {

    public static void main(String[] args){

        String text = "My Name is John";

        char ch[] = text.toCharArray();
        String rev = "";

        for (int i = ch.length-1;i>=0;i--){

            rev+=ch[i];
        }

        System.out.println("output is " +rev);

    }
}
