package LLD.FileSystem;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();
        Directory root = fs.getRoot();

        Directory home = new Directory("home", root);
        root.addChild(home);

        Directory user = new Directory("user", home);
        home.addChild(user);

        File file1 = new File("file1.txt", user, "Hello, World!");
        File file2 = new File("file2.txt", user, "Another file");

        user.addChild(file1);
        user.addChild(file2);

        fs.listDirectory("/home/user"); // Should list all files in /home/user
    }
}
