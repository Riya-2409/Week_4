package com.advancedproblem.validateipaddress;

public class Main {

    public static void main(String[] args) {
        String[] testIPs = {"192.168.1.1","255.255.255.255","256.100.50.25","192.168.1","192.168.01.1","172.16.300.1"};

        for (String ip : testIPs) {
            System.out.println(ip + " → " + (IpAddressValidator.isValidIPv4(ip) ? "Valid" : "Invalid"));
        }
    }
}
