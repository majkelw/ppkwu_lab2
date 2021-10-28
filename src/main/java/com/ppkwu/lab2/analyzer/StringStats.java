package com.ppkwu.lab2.analyzer;

public class StringStats {

    private String str;
    private int numberOfUppercase;
    private int numberOfLowercase;
    private int numberOfDigits;
    private int numberOfSpecialChars;

    public StringStats(String str, int numberOfUppercase, int numberOfLowercase,
                       int numberOfDigits, int numberOfSpecialChars) {
        this.str = str;
        this.numberOfUppercase = numberOfUppercase;
        this.numberOfLowercase = numberOfLowercase;
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
