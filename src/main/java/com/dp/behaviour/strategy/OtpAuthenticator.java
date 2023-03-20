package com.dp.behaviour.strategy;



public class OtpAuthenticator implements Authenticator {
    @Override
    public void authenticate(String userId) {
        System.out.println("OtpAuthenticator.authenticate");

    }
}
