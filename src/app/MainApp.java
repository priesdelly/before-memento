package app;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {
        System.out.println("[Begin] Application");


        FoobarFile file = new FoobarFile("content.txt");

        file.setContent("This is the first version of the file.");
        file.save();

        file.setContent("This is the second version of the file.");
        file.save();

//        file.undo();

        System.out.println(file.getContent());

        System.out.println("[End] Application");
    }
}