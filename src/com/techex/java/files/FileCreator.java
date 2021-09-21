package com.techex.java.files;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public void create() {
        try {
            File newFile = new File("filename.txt");
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
