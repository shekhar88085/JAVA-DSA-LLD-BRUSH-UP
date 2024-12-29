package LLD.DesignPatterns.Creational.Singleton;

import java.util.List;

public class ConfigurationManager {
    private static ConfigurationManager instance; // Static instance for Singleton
    private List<String> apis;
    private List<String> keys;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
    }

    // Thread-safe way to get the singleton instance
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Getters and setters
    public List<String> getApis() {
        return apis;
    }

    public void setApis(List<String> apis) {
        this.apis = apis;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }
}