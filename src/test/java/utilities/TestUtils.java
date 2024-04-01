package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestUtils {
	public Properties properties;

    public TestUtils(String filePath) {
        this.properties = loadProperties(filePath);
    }
    
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    
    public static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
            // Load properties from the input stream
            properties.load(input);
        } catch (IOException e) {
            System.err.println("Error loading properties file: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
        return properties;
    }
    
    
    public String selectFromChain(String key) {
    	String selectedVersionValue = properties.getProperty(key);
        System.out.println("Value of yourPropertyKey: " + selectedVersionValue);
        String driverPath = properties.getProperty(selectedVersionValue);
        System.out.println("The driver path is: " + driverPath);
		return driverPath;
    }
    
    public String getEmailPassword() {
        String runEnvGiven = properties.getProperty("RunEnvironment");
        if (runEnvGiven.equalsIgnoreCase("Local")) {
            try {
                // Dynamically load the class
                Class<?> localRetrieverClass = Class.forName("utilities.SecretManagerRetrieverLocal");
                // Get the getEmailPassword() method
                Method method = localRetrieverClass.getMethod("getEmailPassword");
                // Invoke the method on an instance (null for static methods)
                return (String) method.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return SecretManagerRetriever.getEmailPassword();
        }
    }
    
    public String getJiraToken() {
    	String runEnvGiven = properties.getProperty("RunEnvironment");
    	if (runEnvGiven.equalsIgnoreCase("Local")) {
            try {
                // Dynamically load the class
                Class<?> localRetrieverClass = Class.forName("utilities.SecretManagerRetrieverLocal");
                // Get the getJiraToken() method
                Method method = localRetrieverClass.getMethod("getJiraToken");
                // Invoke the method on an instance (null for static methods)
                return (String) method.invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return SecretManagerRetriever.getJiraToken();
        }
    }
    
}
