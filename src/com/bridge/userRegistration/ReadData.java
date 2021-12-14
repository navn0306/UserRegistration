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
        System.out.println("Enter lName");
        String email = sc.nextLine();
        String regex = "^[abc.]*[a-zA-Z0-9]@[@]@[bl.]*[a-z.]{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
