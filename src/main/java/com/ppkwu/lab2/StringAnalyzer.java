package com.ppkwu.lab2;

public class StringAnalyzer {

    private String str;
    private boolean hasUppercase;
    private boolean hasLowercase;
    private boolean hasDigit;


    public void analyze(String str){
        this.str = str;
        for(int i = 0; i < str.length();i++){
            if(Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i)))
                hasUppercase = true;
            else if(Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i)))
                hasLowercase = true;
            else if(Character.isDigit(str.charAt(i)))
                hasDigit = true;
        }
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean isHasUppercase() {
        return hasUppercase;
    }

    public void setHasUppercase(boolean hasUppercase) {
        this.hasUppercase = hasUppercase;
    }

    public boolean isHasLowercase() {
        return hasLowercase;
    }

    public void setHasLowercase(boolean hasLowercase) {
        this.hasLowercase = hasLowercase;
    }

    public boolean isHasDigit() {
        return hasDigit;
    }

    public void setHasDigit(boolean hasDigit) {
        this.hasDigit = hasDigit;
    }
}
