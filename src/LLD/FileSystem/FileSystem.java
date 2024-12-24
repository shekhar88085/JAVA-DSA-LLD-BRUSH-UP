package LLD.FileSystem;

public class FileSystem {
    private Directory root;

    public FileSystem() {
        root = new Directory("/", null);
    }

    public Directory getRoot() {
        return root;
    }

    public void listDirectory(String path) {
        String[] parts = path.split("/");
        Directory current = root;

        for (int i = 1; i < parts.length; i++) { // Skip the root "/"
            boolean found = false;
            for (FileSystemObject child : current.getChildren()) {
                if (child instanceof Directory && child.getName().equals(parts[i])) {
                    current = (Directory) child;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Directory not found: " + path);
                return;
            }
        }

        current.listContents();
    }
}
