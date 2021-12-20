package com.bridge.userRegistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void whenGivenFirstNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.fName("Abc");
        Assert.assertEquals("valid", firstName);
    }

    @Test
    public void whenGivenFirstNameWithInvalidFName() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.fName("bcdd");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }


    @Test
    public void whenGivenFirstNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.fName(" ");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }
    @Test
    public void whenGivenFirstNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.fName(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Last Name is valid
    @Test
    public void whenGivenLastNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.lName("Gautam");
        Assert.assertEquals("valid", lastName);
    }

    @Test
    public void whenGivenLastNameWithSmallLetter() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.lName("Gautam");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter a valid lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.lName("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter lName", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenLastNameWithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.lName(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenEmailValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String Email = validator.email("abc.xyz@blz.com");
        Assert.assertEquals("valid", Email);
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.email("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.email("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Email", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenEmailStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.email(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPhoneNumberValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.number("91 9066297227");
        Assert.assertEquals("valid", PhoneNo);
    }

    @Test
    public void whenGivenMobileNoWithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.number("91 9876544321");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobileNoWithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.number("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter the Phone", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenMobilNoStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.number(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

    @Test
    public void whenGivenPasswordValid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String password = validator.password("Abcd@123");
        Assert.assertEquals("valid", password);
    }

    @Test
    public void whenGivenPasswordWithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.password("nckdf.fdike3");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.password("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter Password", userRegistrationException.message);
        }
    }

    @Test
    public void whenGivenPasswordStartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.password(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

}