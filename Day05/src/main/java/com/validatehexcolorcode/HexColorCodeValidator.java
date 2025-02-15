package com.validatehexcolorcode;

public class HexColorCodeValidator {
    public static boolean isValidHexColorCode(String color){
        return color.matches("^#([a-fA-F0-9]{6})$");
    }
}
