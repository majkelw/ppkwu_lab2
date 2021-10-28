package com.ppkwu.lab2;

public class StringStatistic {

    private String str;
    private int numberOfUppercase;
    private int numberOfLowercase;
    private int numberOfDigits;
    private int numberOfSpecialChars;


    public StringStatistic analyze(String str){
        this.str = str;
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
        return this;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNumberOfUppercase() {
        return numberOfUppercase;
    }

    public void setNumberOfUppercase(int numberOfUppercase) {
        this.numberOfUppercase = numberOfUppercase;
    }

    public int getNumberOfLowercase() {
        return numberOfLowercase;
    }

    public void setNumberOfLowercase(int numberOfLowercase) {
        this.numberOfLowercase = numberOfLowercase;
    }

    public int getNumberOfDigits() {
        return numberOfDigits;
    }

    public void setNumberOfDigits(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    public int getNumberOfSpecialChars() {
        return numberOfSpecialChars;
    }

    public void setNumberOfSpecialChars(int numberOfSpecialChars) {
        this.numberOfSpecialChars = numberOfSpecialChars;
    }
}
