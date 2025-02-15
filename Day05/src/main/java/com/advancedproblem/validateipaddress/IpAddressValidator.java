package com.advancedproblem.validateipaddress;

public class IpAddressValidator {

    public static boolean isValidIPv4(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})$";
        return ip.matches(regex);
    }
}
