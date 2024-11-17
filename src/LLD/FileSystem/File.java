package LLD.FileSystem;

public class File extends FileSystemObject {
    private String content;

    public File(String name, Directory parent, String content) {
        super(name, parent);
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
