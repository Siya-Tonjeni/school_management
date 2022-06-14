package za.ac.cput.school_management.util;
import org.apache.commons.lang3.StringUtils;
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

    //public static boolean isEmptyOrNull(String string) {
        //return StringUtils.isEmpty(string);
    //}
    public static String setEmptyIfNull(String string){
        if(isEmptyOrNull(string)) return StringUtils.EMPTY;
        return string;
    }

    public static boolean isEmptyOrNull(String s) {
        if (s == null || s.isEmpty() || s.equals(""))
            throw new IllegalArgumentException(" Please fill in the required field");
        return false;
    }


    public static void checkStringParam(String paramName, String paramValue){
        if(isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", paramName));
    }


}
