package generalPractice;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader {

    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            properties.load(fileInputStream);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
