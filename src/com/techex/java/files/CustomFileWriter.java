package com.techex.java.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {
    public void write() {
        try {
            FileWriter myWriter = new FileWriter("CustomMain.txt");
            myWriter.write("package com.yourpackagename>;!\n\n");
            myWriter.write("public class Main {\n");
            myWriter.write("\t\tpublic static void main(String[] args) {\n\n\n\n");
            myWriter.write("\t}\n");
            myWriter.write("}");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
