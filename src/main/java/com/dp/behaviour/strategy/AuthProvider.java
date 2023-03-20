package com.dp.behaviour.strategy;

public class AuthProvider {

    private Authenticator authenticator;

    public AuthProvider setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
        return this;
    }

    public AuthProvider(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void authenticate(String userId) {
        authenticator.authenticate(userId);
    }
}
