package LLD.DesignPatterns.Structural.Composite;

public class Main {
    public static void main(String[] args) {
        // Files
        File file1 = new File("file1.txt", 50);
        File file2 = new File("file2.jpg", 150);
        File file3 = new File("file3.mp3", 300);

        // Subfolder
        Folder subFolder = new Folder("SubFolder1");
        subFolder.addComponent(file1);
        subFolder.addComponent(file2);

        // Main folder
        Folder mainFolder = new Folder("MainFolder");
        mainFolder.addComponent(subFolder);
        mainFolder.addComponent(file3);

        // Display structure
        mainFolder.displayStructure("");
        System.out.println("Total Size: " + mainFolder.getSize() + "KB");
    }
}