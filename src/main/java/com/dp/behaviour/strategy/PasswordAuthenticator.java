package com.dp.behaviour.strategy;



public class PasswordAuthenticator implements Authenticator {
    @Override
    public void authenticate(String userId) {
        System.out.println("PasswordAuthenticator.authenticate");

    }
}
