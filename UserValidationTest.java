package com.bridgelabz.uservalidation.test;
import com.bridgelabz.uservalidation.service.UserValidation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class UserValidationTest
{
    UserValidation uservalidation = null;
    @Before
    public void userCreation()
    {
        uservalidation = new UserValidation();
    }
    @Test
    public void givenFirstName_When3_OrMoreChar_AndStartWithUpperCase_ReturnTrue()
    {
        Assert.assertTrue(uservalidation.validateFirstName("Nitin"));
    }
    @Test
    public void givenFirstName_When3_OrMoreChar_AndStartWithLowerCase_ReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateFirstName("nitin"));
    }
    @Test
    public void givenFirstName_WhenLessThen3Char_ReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateFirstName("ni"));
    }
    @Test
    public void givenFirstName_WhenLessThen3Char_AndStartWithUpperCase_ReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateFirstName("Ni"));
    }
    @Test
    public void givenLastName_When3_OrMoreChar_AndStartWithUpperCase_ReturnTrue()
    {
        Assert.assertTrue(uservalidation.validateFirstName("Makin"));
    }
    public void givenLastName_When3_OrMoreChar_AndStartWithLowerCase_ReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateFirstName("makin"));
    }
    @Test
    public void givenLastName_WhenLessThen3Char_ReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateFirstName("ni"));
    }
    @Test
    public void givenLastName_WhenLessThen3Char_AndStartWithUpperCase_ReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateFirstName("Ma"));
    }
    @Test
    public void givenEmailWhen_Has3MandatoryField_ThenReturnTrue()
    {
        Assert.assertTrue(uservalidation.validateEMail("nitinmakin124@gmail.com"));
    }
    @Test
    public void givenEmailWhen_HasDonotHas_3_MandatoryField_ThenReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateEMail("nitinmakin124@com"));
    }
    @Test
    public void givenEmailWhen_HasDonotHas_AtTheRate_ThenReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateEMail("nitinmakin124gmail.com"));
    }
    @Test
    public void givenEmailWhen_HasDonotHas_DOT_ThenReturnFalse()
    {
        Assert.assertFalse(uservalidation.validateEMail("nitinmakin124@gmailcom"));
    }
    @Test
    public void whenGivenNo_StartWith91AndHas10Digits_ThenReturnTrue()
    {
        Assert.assertTrue(uservalidation.validatePhoneNo("911234567890"));
    }
    @Test
    public void whenGivenNo_StartWith91AndHas10DigitsFollowedBySpace_ThenReturnTrue()
    {
        Assert.assertTrue(uservalidation.validatePhoneNo("91 1234567890"));
    }
    @Test
    public void whenGivenNo_NotStartWith91AndHas10DigitsFollowedBySpace_ThenReturnFalse()
    {
        Assert.assertFalse(uservalidation.validatePhoneNo("34 1234567890"));
    }
    @Test
    public void whenGivenNo_HasLessThen10DigitsAndStartWith91ThenReturnFalse()
    {
        Assert.assertFalse(uservalidation.validatePhoneNo("91 12345678"));
    }
}
