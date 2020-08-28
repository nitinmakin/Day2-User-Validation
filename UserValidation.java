package com.bridgelabz.uservalidation.service;
import java.util.regex.*;

public class UserValidation
{
    private  String firstName = "^[A-Z]{1}([a-z]{2,15})*";
    private String lastName = firstName;
    private String eMail = "^[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    private String phoneNo = "^[91]+[ ]{0,1}+[1-9][0-9]{9}$";
    private String password = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[!%&$#@%!]{1}){8,}";

    public  boolean validateFirstName(String firstName)
    {
        return Pattern.matches(this.firstName,firstName);
    }
    public  boolean validateLastName(String lastName)
    {
        return Pattern.matches(this.lastName,lastName);
    }
    public boolean validateEMail(String eMail)
    {
        return Pattern.matches(this.eMail,eMail);
    }
    public boolean validatePhoneNo(String phoneNo)
    {
        return Pattern.matches(this.phoneNo,phoneNo);
    }
    public boolean validatePassword(String password)
    {
        return Pattern.matches(this.password,password);
    }
}


