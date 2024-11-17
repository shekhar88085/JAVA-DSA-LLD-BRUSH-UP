package LLD.FileSystem;

public class FileSystemObject {
    protected String name;
    protected Directory parent;

    public FileSystemObject(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        if (parent == null) {
            return name; // Root directory
        }
        return parent.getPath() + "/" + name;
    }
}
