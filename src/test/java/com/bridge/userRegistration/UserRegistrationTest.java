package com.bridge.userRegistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void whenGivenFirstNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFname.validate("rahul");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithInvalidFName() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFname.validate("bcdd");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }


    @Test
    public void whenGivenFirstNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFname.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenFirstNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFname.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    @Test
    public void whenGivenLastNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLname.validate("Ga");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithSmallLetter() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLname.validate("gautam");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLname.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFname.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenEmailValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        validator.validateEmail.validate("abc.xyz@blz.com");
        Assert.assertEquals("valid", "valid");
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmail.validate("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmail.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmail.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPhoneNumberValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        validator.validatePhone.validate("91 9066297227");
        Assert.assertEquals("valid", "valid");
    }

    @Test
    public void whenGivenMobileNoWithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhone.validate("91 9876544321");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobileNoWithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhone.validate("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobilNoStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhone.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPasswordValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        validator.validatePassword.validate("Abcd@123");
        Assert.assertEquals("valid", "valid");
    }

    @Test
    public void whenGivenPasswordWithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePassword.validate("nckdf.fdike3");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePassword.validate("nc");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePassword.validate(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

}