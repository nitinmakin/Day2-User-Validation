package com.bridgelabz.uservalidation.service;
import java.util.Scanner;
import java.util.regex.*;

public class UserValidation
{
    private Pattern pattern;
    private Matcher matcher;
    private  String firstName = "^[A-Z]([a-z]{2,15})*";
    private String lastName = firstName;
    private String eMail = "^[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    private String phoneNo ="^[91]+[ ]{0,1}+[1-9][0-9]{9}$";
    private String password = "^[A-Za-z]{8,20}";
    public UserValidation()
    {
        pattern = pattern.compile(firstName);
        pattern = pattern.compile(lastName);
        pattern =pattern.compile(eMail);
        pattern = pattern.compile(phoneNo);
        pattern = pattern.compile(password);
    }


    public  boolean validateFirstName(String firstName)
    {
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public  boolean validateLastName(String LastName)
    {
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean validateEMail(String eMail)
    {
        matcher = pattern.matcher(eMail);
        return matcher.matches();
    }
    public boolean validatePhoneNo(String phoneNo)
    {
        matcher = pattern.matcher(phoneNo);
        return matcher.matches();
    }
    public boolean validatePasswordAtleast1UpperCase(String password)
	{
		matcher = pattern.matcher(password);
		return matcher.matches();
	}
}


