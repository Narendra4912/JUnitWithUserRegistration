import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class UserFieldDataTesting {
    /*String firstName, lastName, email;
    String mobileNo, password;

    UserValidation user = new UserValidation();
    Scanner sc = new Scanner(System.in);*/

    @Before
    public void setUpEnvironment() {
        System.out.println("Inside the @Before Method");
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
    public void givenLastNameShouldPassWhenFirstNameRulesSatisfied() {

        String lastName = "Xyz";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validUserFirstName(lastName);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }


}
