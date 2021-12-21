package com.bridge.userRegistration;

@FunctionalInterface
public interface UserRegistrationInterface {

    boolean validate(String value) throws UserRegistrationException;

}
