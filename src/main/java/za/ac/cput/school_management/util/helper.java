package za.ac.cput.school_management.util;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class helper {

    public static String generateUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static String checkNameAndSurname(String firstName, String lastName){
        if (firstName.equals("")){
            throw new IllegalArgumentException("FirstName cannot be empty");
        }
        else if (lastName.equals("")){
            throw new IllegalArgumentException("LastName cannot be empty");
        }
        return firstName + lastName;
    }

    public static boolean emailIsValid(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);

    }

}
