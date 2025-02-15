package com.validatehexcolorcode;

public class Main {
    public static void main(String args[]){
        String colors[] = {"#FFA500","#ff4500", "#123"};
        for(String color:colors){
            System.out.println(color+"->"+(HexColorCodeValidator.isValidHexColorCode(color)?"Valid":"InValid"));
        }
    }
}
