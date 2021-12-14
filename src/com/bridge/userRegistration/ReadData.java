package com.bridge.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadData {

    public static void fName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FName");
        String fName = sc.nextLine();
         String regex = "^[A-Z][a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fName);

        if (matcher.matches()) {
            System.out.println("Valid FName");
        } else {
            System.out.println("Invalid FName");
        }
    }
    public static void lName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lName");
        String lName = sc.nextLine();
        String regex = "^[A-Z][a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lName);

        if (matcher.matches()) {
            System.out.println("Valid lName");
        } else {
            System.out.println("Invalid lName");
        }
    }

    public static void email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email");
        String email = sc.nextLine();
        String regex = "^[abc.]*[a-zA-Z0-9]@[@][bl.]*[a-z.]{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void mobile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        String mobile = sc.nextLine();
        String regex = "^(91[ ])?[6-9]\\d{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);

        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }

    public static void password() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = sc.nextLine();
        String regex = "(?=.*[A-Z])[a-zA-Z0-9@#$%^&*()]{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
