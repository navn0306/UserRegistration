package com.bridge.userRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {
    private String actualResult;
    private String expectedResult;
    private ReadData read;

    //Constructor
    public UserRegistrationParameterizedTest(String actualResult, String expectedResult) {

        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init() {
        read = new ReadData();
    }

    @Parameterized.Parameters
    public static Collection emailInput() {
        return Arrays.asList(new Object[][]{{"navneet@@yahoo.com", "Not Valid"}, {"abc.xyz@bl.co.india", "Not Valid"},
                {"abc.xyz$bl.co.in", "Not Valid"}, {"abc.xyz@bl.co.in", "Valid Email"}});
    }

    @Parameterized.Parameters
    public static Collection passwordInput() {
        return Arrays.asList(new Object[][]{{"Abccc@123", "Not Valid"}, {"abccc@@@123", "Not Valid"},
                {"Ac@123", "Not Valid"}, {"AAAAAA@123A", "Not Valid"}});
    }

    @Test
    public void testEmail() {
        assertEquals(expectedResult, read.email(actualResult));
    }

    @Test
    public void testPassword() {
        assertEquals(expectedResult, read.password(actualResult));
    }
}
