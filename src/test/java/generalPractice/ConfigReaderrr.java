package generalPractice;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReaderrr {
    private static Properties properties = new Properties();
    static {
        try {


            FileInputStream fis = new FileInputStream("configuration.properties");
            properties.load(fis);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public String getProperty(String browser){
        return properties.getProperty(browser);
    }
}
