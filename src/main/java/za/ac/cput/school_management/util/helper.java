package za.ac.cput.school_management.util;
import java.util.UUID;
public class helper {

    public static String generateUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
