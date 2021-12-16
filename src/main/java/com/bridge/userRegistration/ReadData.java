package com.bridge.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadData {

    public static String fName(String fName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);

        if (matcher.matches())
            return "Valid FName";

        return "Not Valid";

    }

    public static String lName(String lName) {

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lName);

        if (matcher.matches())
            return "Valid LName";

        return "Not Valid";
    }

    public static String email(String email) {

        String regex = "^[a-z0-9]{3,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches())
            return "Valid Email";

        return "Not Valid";
    }

    public static String mobile(String mobile) {

        String regex = "^(91[ ])?[6-9]\\d{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);

        if (matcher.matches())
            return "Valid Mobile Number";

        return "Not Valid";
    }

    public static String password(String password) {

        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]{1})(?=\\\\S+$).{8,20}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches())
            return "Valid Password";

        return "Not Valid";
    }
}
