package Questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void main(String[] args) throws IOException {
        String path = "File/Config.properties";

        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("passport"));
        properties.setProperty("server", "Development");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "Added new Property Dev");

    }
}
