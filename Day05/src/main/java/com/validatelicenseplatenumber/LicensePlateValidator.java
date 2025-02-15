package com.validatelicenseplatenumber;

public class LicensePlateValidator {

    public static boolean isValidLicensePlateNumber(String plate){
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }
}
