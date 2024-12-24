package LLD.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemObject {
    private List<FileSystemObject> children;

    public Directory(String name, Directory parent) {
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public void addChild(FileSystemObject child) {
        children.add(child);
    }

    public List<FileSystemObject> getChildren() {
        return children;
    }

    public void listContents() {
        for (FileSystemObject child : children) {
            System.out.println(child.getPath());
        }
    }
}
