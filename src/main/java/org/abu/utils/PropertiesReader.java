package org.abu.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private PropertiesReader() {
    }

    /**
     * @param path location where .properties file resides
     * @return Properties object or null if not successful
     */
    public static Properties getProperties(String path) {
        Properties properties = new Properties();

        try (var file = new FileInputStream(path)) {
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
