package com.annotation.practiceproblem.advanced.roleallowed;

public class Main {

    public static void main(String[] args) {
        SecureService service = new SecureService();
        AccessControl adminControl = new AccessControl("ADMIN");
        AccessControl userControl = new AccessControl("USER");

        System.out.println("Admin trying to execute adminTask:");
        adminControl.executeMethod(service, "adminTask");

        System.out.println("User trying to execute adminTask:");
        userControl.executeMethod(service, "adminTask");
    }
}
