package com.company;

import java.util.Scanner;

/*
* Learning different concepts
* Working on Email App
*
*/

public class Email {
    private final String firstName;
    private final String lastName;
    private String password;
    private final String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to have first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        String companySuffix = "babygames.com";
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method to ask for department
        String department = setDepartment();

        // Create a random password method
        int defaultPasswordLength = 7;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    // Ask for department the employee works in
    private String setDepartment() {
        System.out.print("1) Marketing\n2) Production\n3) Sales\n0) None\nEnter Department Code: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {return "marketing";}
        else if (choice == 2) {return "production";}
        else if (choice == 3) {return "sales";}
        else {return "";}
    }

    // Generate a random password
    private String randomPassword(int length) {
        String pwSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
        char[] pwChar = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * pwSet.length());
            pwChar[i] = pwSet.charAt(rand);
        }
        return new String(pwChar);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailboxCapacity + "mb";
    }
}
