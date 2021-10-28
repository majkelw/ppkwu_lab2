package com.ppkwu.lab2.analyzer;

public class StringAnalyzer {

    public StringStats analyze(String str){
        int numberOfUppercase = 0, numberOfLowercase = 0,
                numberOfDigits = 0, numberOfSpecialChars = 0;
        for(int i = 0; i < str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                numberOfUppercase++;
            else if(Character.isLowerCase(str.charAt(i)))
                numberOfLowercase++;
            else if(Character.isDigit(str.charAt(i)))
                numberOfDigits++;
            else if(!Character.isWhitespace(str.charAt(i)))
                numberOfSpecialChars++;
        }
        return new StringStats(str, numberOfUppercase, numberOfLowercase,
                numberOfDigits, numberOfSpecialChars);
    }

}
