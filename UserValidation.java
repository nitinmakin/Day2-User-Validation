package com.bridgelabz.uservalidation.service;
import java.util.Scanner;
import java.util.regex.*;

public class UserValidation
{
        private Pattern pattern;
        private Matcher matcher;
        private  String firstName = "^[A-Z]([a-z]{2,15})*";
     //   private String lastName = firstName;
       // private String eMail = " ";
        Scanner sn=new Scanner(System.in);

        public UserValidation()
        {
            pattern=pattern.compile(firstName);
          //  pattern=pattern.compile(lastName);
        }

        public  boolean validateFirstName(String firstName)
        {
            matcher=pattern.matcher(firstName);
            return matcher.matches();
        }
        public  boolean validateLastName(String LastName)
        {
            matcher=pattern.matcher(firstName);
            return matcher.matches();
        }
//
//        public static void main(String[] args)
//        {
//            UserValidation uservalidation = new UserValidation();
//            System.out.println(uservalidation.validateFirstName("Nit"));
//        }
    }


