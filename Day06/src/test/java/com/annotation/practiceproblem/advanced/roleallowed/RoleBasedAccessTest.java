package com.annotation.practiceproblem.advanced.roleallowed;

import org.junit.jupiter.api.Test;

public class RoleBasedAccessTest {

    @Test
    void testAdminAccess() {
        AccessControl adminControl = new AccessControl("ADMIN");
        SecureService service = new SecureService();
        adminControl.executeMethod(service, "adminTask");
    }

    @Test
    void testUserAccessDenied() {
        AccessControl userControl = new AccessControl("USER");
        SecureService service = new SecureService();
        userControl.executeMethod(service, "adminTask"); // Should print "Access Denied!"
    }
}
