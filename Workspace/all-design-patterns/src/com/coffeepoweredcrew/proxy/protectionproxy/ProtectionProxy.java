package com.coffeepoweredcrew.proxy.protectionproxy;

public class ProtectionProxy implements Service {

    private final Service realService;
    private final String userRole;

    public ProtectionProxy(String userRole) {
        this.realService = initRealService();
        this.userRole = userRole;
    }

    private Service initRealService() {
        // may have complex initialization logic
        return new RealService();
    }

    @Override
    public void execute() {
        if ("ADMIN".equals(userRole)) {
            realService.execute();
        } else {
            throw new RuntimeException("User role not allowed to execute sensitive operation.");
        }
    }
}
