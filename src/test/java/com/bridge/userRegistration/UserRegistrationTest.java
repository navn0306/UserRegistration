package com.bridge.userRegistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void whenGivenFirstName_ShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String firstName = validator.validateFirstName("Abc");
        Assert.assertEquals("valid", firstName);
    }

    // User Register Fast Name is Invalid
    @Test
    public void whenGivenFirstName_WithInvalidFName() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFirstName("bcdd");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }


    @Test
    public void whenGivenFirstName_WithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFirstName(" ");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid FName", userRegistrationException.message);
        }
    }

    // User Register Fast Name is Null
    @Test
    public void whenGivenFirstName_WithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateFirstName(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Last Name is valid
    @Test
    public void whenGivenLastName_ShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String lastName = validator.validateLastName("Gautam");
        Assert.assertEquals("valid", lastName);
    }

    // User register Last Name is Invalid
    @Test
    public void whenGivenLastName_WithSmallLetter() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLastName("Gautam");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter a valid lName", userRegistrationException.message);
        }
    }

    //  User Register Last Name in case  Empty
    @Test
    public void whenGivenLastName_WithEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLastName("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter lName", userRegistrationException.message);
        }
    }

    //User Register Last Name in case  Null
    @Test
    public void whenGivenLastName_WithNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateLastName(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Email-id is  valid
    @Test
    public void whenGivenEmail_Valid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String Email = validator.validateEmailID("abc.xyz@blz.com");
        Assert.assertEquals("valid", Email);
    }

    //  User Register Email-id is Invalid
    @Test
    public void whenGivenEmail_WithoutSignShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmailID("abc.xyz.bl.co.in");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Email", userRegistrationException.message);
        }
    }

    // User Register Email-id in case of Empty value
    @Test
    public void whenGivenEmail_WithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmailID("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Email", userRegistrationException.message);
        }
    }

    // User register Email-id in case null value
    @Test
    public void whenGivenEmail_StartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validateEmailID(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Phone Number is valid
    @Test
    public void whenGivenPhoneNumber_Valid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String PhoneNo = validator.validatePhoneNumber("91 9919819801");
        Assert.assertEquals("valid", PhoneNo);
    }

    // User Register Phone Number is Invalid
    @Test
    public void whenGivenMobileNo_WithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhoneNumber("91 9876544321");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
        }
    }

    // User Register Phone Number in case of Empty
    @Test
    public void whenGivenMobileNo_WithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhoneNumber("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter the Phone", userRegistrationException.message);
        }
    }

    // User Register Phone Number in case  Null Value
    @Test
    public void whenGivenMobilNo_StartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePhoneNumber(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }


    // User Register Password is valid
    @Test
    public void whenGivenPassword_Valid() throws UserRegistrationException {
        UserRegistration validator = new UserRegistration();
        String password = validator.validatePasswordWithRule("Abcd@123");
        Assert.assertEquals("valid", password);
    }

    // User Register Password is Invalid
    @Test
    public void whenGivenPassword_WithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePasswordWithRule("dfjhs.srfshr3");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter valid password", userRegistrationException.message);
        }
    }

    // User register password in case of Empty value
    @Test
    public void whenGivenPassword_WithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePasswordWithRule("");
        } catch (UserRegistrationException userRegistrationException) {
            Assert.assertEquals("Enter Password", userRegistrationException.message);
        }
    }

    // User register password in case of Null value
    @Test
    public void whenGivenPassword_StartWithDotShouldReturnNullValue() throws UserRegistrationException {
        try {
            UserRegistration validator = new UserRegistration();
            validator.validatePasswordWithRule(null);
        } catch (NullPointerException nullPointerException) {
            Assert.assertNotEquals("valid", nullPointerException.getMessage());
        }
    }

}