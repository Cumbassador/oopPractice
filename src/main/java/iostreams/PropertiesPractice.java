package iostreams;

import java.io.*;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/application.properties");
        Properties props = new Properties();
        props.load(new FileInputStream(file));
        System.out.println("props.getProperty(\"key1\") = " + props.getProperty("key1"));

        props.setProperty("key2","value2");
        System.out.println("props.getProperty(\"key2\") = " + props.getProperty("key2"));
        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
        Properties propsFromSream = new Properties();
        propsFromSream.load(inputStream);
        System.out.println("propsFromSream.getProperty(\"key1\") = " + propsFromSream.getProperty("key1"));

        ClassLoader classLoader1 = PropertiesPractice.class.getClassLoader();
        InputStream inputStream1 = classLoader1.getResourceAsStream("app.properties");
        Properties properties = new Properties();
        properties.load(inputStream1);
        System.out.println("properties.getProperty(\"login\") = " + properties.getProperty("login"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));

    }
}
