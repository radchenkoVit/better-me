package better.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.slf4j.LoggerFactory.getLogger;

public class PropertyLoader {
    private static Properties properties = loadProperties();

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getUri() {
        return getProperty("uri").trim();
    }

    public static int getPort() {
        return Integer.parseInt(getProperty("port").trim());
    }

    private static Properties loadProperties() {
        Properties prop = new Properties();

        try (InputStream input = new FileInputStream("application.properties")) {
            prop.load(input);
        } catch (IOException e) {
            getLogger(PropertyLoader.class)
                    .info("Failed to read properties file, exception: ".concat(e.getMessage()));
        }

        return prop;
    }
}
