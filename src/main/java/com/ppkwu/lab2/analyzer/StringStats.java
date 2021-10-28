package com.ppkwu.lab2.analyzer;

public class StringStats {

    private String str;
    private int numberOfUpperCase;
    private int numberOfLowerCase;
    private int numberOfDigits;
    private int numberOfSpecialChars;

    public StringStats(String str, int numberOfUpperCase, int numberOfLowerCase,
                       int numberOfDigits, int numberOfSpecialChars) {
        this.str = str;
        this.numberOfUpperCase = numberOfUpperCase;
        this.numberOfLowerCase = numberOfLowerCase;
        this.numberOfDigits = numberOfDigits;
        this.numberOfSpecialChars = numberOfSpecialChars;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNumberOfUppercase() {
        return numberOfUpperCase;
    }

    public void setNumberOfUppercase(int numberOfUppercase) {
        this.numberOfUpperCase = numberOfUppercase;
    }

    public int getNumberOfLowercase() {
        return numberOfLowerCase;
    }

    public void setNumberOfLowercase(int numberOfLowercase) {
        this.numberOfLowerCase = numberOfLowercase;
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
