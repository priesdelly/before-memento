package app;

import java.io.IOException;

public class BeforeMemento {

    public static void main(String[] args) throws IOException {
        System.out.println("[Begin] Application");

        var file = new FoobarFile("content.txt");

        file.setContent("This is the 1 version of the file.");
        file.setContent("This is the 2 version of the file.");
        file.setContent("This is the 3 version of the file.");
        file.setContent("This is the 4 version of the file.");
        file.setContent("This is the 5 version of the file.");

        System.out.println(file.getContent());

        file.save();

        System.out.println("[End] Application");
    }
}