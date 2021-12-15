import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserFieldDataTesting {
    /*String firstName, lastName, email;
    String mobileNo, password;

    UserValidation user = new UserValidation();
    Scanner sc = new Scanner(System.in);*/

    @Before
    public void setUpBeforeEnvironment() {
        System.out.println("Inside the @Before Method");
    }

    @After
    public void setUpAfterEnvironment() {
        System.out.println("Inside the @After Method");
    }

    @Test
    public void givenFirstNameShouldPassWhenFirstNameRulesSatisfied() {

        String firstName = "Abc";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validUserFirstName(firstName);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenLastNameShouldPassWhenLastNameRulesSatisfied() {

        String lastName = "Xyz";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validUserLastName(lastName);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void givenEmailShouldPassWhenEmailRulesSatisfied() {

        //Happy Email testing
        String email = "abc.xyz@domain.co.in";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validEmailAddress(email);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmailShouldPassWhenEmailRulesSatisfied2() {

        //Sad Email testing
        String email = "abc.xyz@domain.co.india";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validEmailAddress(email);
        boolean expectedResult = true;
        Assert.assertNotEquals(expectedResult, actualResult);
    }

    @Test
    public void givenMobileNoShouldPassWhenMobileNoRulesSatisfied() {

        String mobileNo = "91 9876543210";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validMobileNo(mobileNo);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordIs8DigitInLength() {

        String password = "abcdefgh";
        String regex=".{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        boolean actualResult = matcher.matches();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasMinimum1CapitalLetter() {

        String password = "Abcdefgh";
        String regex="(?=.*[A-Z]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        boolean actualResult = matcher.matches();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasMinimum1NumericLetter() {

        String password = "Abcde1gh";
        String regex="(?=.*[0-9]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        boolean actualResult = matcher.matches();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasExact1SpecialLetter() {

        String password = "Abcd@1gh";
        String regex="(?=.*[!@#$%^&*]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        boolean actualResult = matcher.matches();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
