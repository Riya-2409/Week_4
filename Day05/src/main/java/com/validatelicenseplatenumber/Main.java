package com.validatelicenseplatenumber;

public class Main {
    public static void main(String args[]){
        String plates[] = {"AB1234","A12345"};
        for (String plate : plates) {
            System.out.println(plate + " → " + (LicensePlateValidator.isValidLicensePlateNumber(plate) ? "Valid" : "Invalid"));
        }
    }
}
