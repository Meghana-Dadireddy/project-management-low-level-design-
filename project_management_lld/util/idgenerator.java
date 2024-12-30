package util;
import java.util.UUID;
public class idgenerator {
    public static String generateid(){
        return UUID.randomUUID().toString();
    }
}
