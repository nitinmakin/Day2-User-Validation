package com.bridgelabz.uservalidation.test;

import com.bridgelabz.uservalidation.service.UserValidation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class UserEmailValidationTest
{
    String eMail;
    boolean expected;

    UserValidation userValidation = null;

    public UserEmailValidationTest(String eMail, boolean expected)
    {
        this.eMail = eMail;
        this.expected = expected;
    }
    @Before
    public void creatUserValidation()
    {
        userValidation = new UserValidation();
    }
    @Parameterized.Parameters
    public static Collection input(){

        return Arrays.asList(new Object[][]
                { {"kumarvicky25jsr@gmail.com",true},
                        {"abc@yahoo.com",true},
                        {"abc-100@yahoo.com",true},
                        {"abc.100@yahoo.com",true},
                        {"abc111@abc.com",true},
                        {"abc-100@abc.net",true},
                        {"abc@1.com",true},
                        {"abc+100@gmail.com",true},
                        {"abc@gmail.com.aa.au",false},
                        {"abc..2002@gmail.com",false},
                        {".abc@abc.com",false},
                        {"abc@gmail.com.1a",false},
                        {"abc123@gmail.a",false},
                        {"abc{}*@gmail.com",false},
                        {"abc@abc@gmail.com",false},
                        {"abc@%*.com",false},
                        {"abc123@.com.com",false},
                        {"abc@.com.my",false},
                        {"abc@gmail.com.in",false},
                        {"abc-gmail.com",false}});

    }
    @Test
    public void inputEmailTest(){
        Assert.assertEquals(this.expected,userValidation.validateEMail(this.eMail));
    }
}
