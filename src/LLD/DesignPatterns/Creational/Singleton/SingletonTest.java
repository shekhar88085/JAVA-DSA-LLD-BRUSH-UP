package LLD.DesignPatterns.Creational.Singleton;

import java.util.Arrays;

public class SingletonTest {
    public static void main(String[] args) {
        // Get the Singleton instance for the first time
        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        manager1.setApis(Arrays.asList("API1", "API2"));
        manager1.setKeys(Arrays.asList("Key1", "Key2"));

        // Get the Singleton instance again
        ConfigurationManager manager2 = ConfigurationManager.getInstance();

        // Print details from both references
        System.out.println("Manager1 APIs: " + manager1.getApis());
        System.out.println("Manager2 APIs: " + manager2.getApis());

        // Verify if both references point to the same instance
        System.out.println("Are both references the same? " + (manager1 == manager2));
        System.out.println("HashNode manager1 " + manager1.hashCode() + " hashnode manager2 " + manager2.hashCode());
    }
}