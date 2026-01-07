package com.github.sameerbhilare.proxy.protectionproxy;

public class Client {

    public static void main(String[] args) {

        Service adminProxy = new ProtectionProxy("ADMIN");
        adminProxy.execute(); // works

        Service userProxy = new ProtectionProxy("USER");
        userProxy.execute(); // exception

    }
}
