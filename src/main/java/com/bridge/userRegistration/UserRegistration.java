package com.bridge.userRegistration;


public class UserRegistration {
    public String VALIDATE_NAME = "^[A-Z]{1}[a-z]{2,}$";
    public String VALIDATE_EMAIL = "^[a-z0-9]{3,20}([_+.-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
    public String VALIDATE_PHONE_NUMBER = "^[1-9]{2}( )[0-9]{10}$";
    public String VALIDATE_PASSWORD_WITH_RULE = "^([a-zA-Z0-9])?.{8,}$";

    public String fName(String firstName) throws UserRegistrationException {
        try {
            if (firstName.length() == 0) {
                throw new UserRegistrationException("Enter valid FName", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (firstName.matches(VALIDATE_NAME)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Enter valid FName", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    }

    public String lName(String lastName) throws UserRegistrationException {
        try {
            if (lastName.length() == 0) {
                throw new UserRegistrationException("Enter lName", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (lastName.matches(VALIDATE_NAME)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Enter valid lName", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    }

    public String email(String Email) throws UserRegistrationException {
        try {
            if (Email.length() == 0) {
                throw new UserRegistrationException("Enter valid Email", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (Email.matches(VALIDATE_EMAIL)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Enter valid Email", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    }

    public String number(String PhoneNo) throws UserRegistrationException {
        try {
            if (PhoneNo.length() == 0) {
                throw new UserRegistrationException("Enter the Phone", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (PhoneNo.matches(VALIDATE_PHONE_NUMBER)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Enter the Phone", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    }

    public String password(String Password) throws UserRegistrationException {
        try {
            if (Password.length() == 0) {
                throw new UserRegistrationException("Enter Password", UserRegistrationException.ExceptionType.EMPTY);
            }
            if (Password.matches(VALIDATE_PASSWORD_WITH_RULE)) {
                return "valid";
            } else {
                throw new UserRegistrationException("Enter Password", UserRegistrationException.ExceptionType.INVALID);
            }
        } catch (NullPointerException exception) {
            throw new NullPointerException(exception.getMessage());
        }
    }
}
