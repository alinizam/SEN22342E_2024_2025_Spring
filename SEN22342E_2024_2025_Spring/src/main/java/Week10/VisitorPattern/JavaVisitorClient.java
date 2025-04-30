package Week10.VisitorPattern;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaVisitorClient {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\calismakod");

        try {
            MyFileVisitor visitor=new MyFileVisitor();
            Files.walkFileTree(Paths.get("C:\\files"),visitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
