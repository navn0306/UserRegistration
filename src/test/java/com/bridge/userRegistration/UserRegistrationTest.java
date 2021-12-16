package com.bridge.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenTextWhenItContainsFirstCapsInFnameAndMinThreeAlphabetsShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.fName("Aman");
        String expectedResult = "Valid FName";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void givenTextWhenItDoesNotContainsFirstCapsInFnameShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.fName("aman");
        String expectedResult = "Not Valid";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void givenTextWhenItContainsFirstCapsInFnameButNotMinThreeCharShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.fName("am");
        String expectedResult = "Not Valid";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void givenWhenItContainsFirstCapsInLnameAndMinThreeAlphabetsShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.lName("Kumar");
        String expectedRes = "Valid LName";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenTextWhenItDoesNotContainsFirstCapsInlnameShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.lName("kumar");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenTextWhenItContainsFirstCapsInlnameButNotMinThreeCharShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.lName("ku");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenDoesNotContainsAtTheRateShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("kuabc.yahoo.com");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenDoesNotContainsabcShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz.yahoo.co.in");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsMoreThanThreeCharAtLastShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz.yahoo.co.india");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz.yahoo.co.in.co");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsOneCharInTLDShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz.yahoo.co.i");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsDoubleDotsShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz..yahoo.co.i");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsSpecialCharacterShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz.yahoo.c@.i");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenItContainsDigitsInTLDShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("xyz.yahoo.c1.i");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenEmailWhenAccordingToProperReqShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.email("abc.xyz@bl.co.in");
        String expectedRes = "Valid Email";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.mobile("91 8123434456");
        String expectedRes = "Valid Mobile Number";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenMobileNumberWithoutSpaceAndProperNumberShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.mobile("918123434456");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenMobileNumberWithSpaceButNotProperCountryCodeShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.mobile("348123434456");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutAnUpperCaseShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.password("abccc@123");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutASpecialCharShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.password("abccc123");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutALowerCaseShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.password("AAAAAAA@123");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithoutMinNumOfCharShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.password("Ac@123");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }
    @Test
    public void givenPasswordWithMultipleSpecCharShouldReturnFalse() {

        ReadData readData = new ReadData();
        String actualResult = readData.password("abccc@@@123");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

    @Test
    public void givenPasswordWithProperRequirementsShouldReturnTrue() {

        ReadData readData = new ReadData();
        String actualResult = readData.password("Abccc@123");
        String expectedRes = "Not Valid";
        Assert.assertEquals(actualResult, expectedRes);
    }

}