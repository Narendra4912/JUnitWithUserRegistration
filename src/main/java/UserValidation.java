import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    String firstName, lastName, email, mobileNo, password;

    public void validUserFirstName(String firstName)
    {
        this.firstName = firstName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches())
            System.out.println("User's First Name = "+ firstName +" is matching with the pattern !!!");
        else
            System.out.println("User's First Name = "+ firstName +" is not matching with the pattern !!!");
    }

    public void validUserLastName(String lastName)
    {
        this.lastName = lastName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.matches())
            System.out.println("User's Last Name = "+ lastName +" is matching with the pattern !!!");
        else
            System.out.println("User's Last Name = "+ lastName +" is not matching with the pattern !!!");
    }

    public void validEmailAddress(String email)
    {
        this.email = email;
        String regex = "^[a-z0-9]{3,20}([+._-][a-z0-9]+)?@[a-z0-9]+.[a-z0-9]{2,3}(.[a-z]{2})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
            System.out.println("User's Email Address = "+ email +" is matching with the pattern !!!");
        else
            System.out.println("User's Email Address = "+ email +" is not matching with the pattern !!!");
    }

    public void validMobileNo(String mobile)
    {
        this.mobileNo = mobile;
        String regex = "^[1-9]{2}( )[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(mobileNo));

        if(matcher.matches())
            System.out.println("User's Mobile No = "+ mobileNo +" is matching with the pattern !!!");
        else
            System.out.println("User's Mobile No = "+ mobileNo +" is not matching with the pattern !!!");
    }

    public void validPassword(String password) {

        this.password = password;
        String regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            System.out.println("User's Password = "+ password +" is accepted !!!");
        else
            System.out.println("User's Password = "+ password +" is not following the standard password rules !!!");
    }
}
