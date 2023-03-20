package com.dp.behaviour.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        AuthProvider authProvider = new
                AuthProvider(new PasswordAuthenticator());
        authProvider.authenticate("1234");

        authProvider.setAuthenticator(new OtpAuthenticator());
        authProvider.authenticate("1234");
    }
}
