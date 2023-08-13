package com.urise.webapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MainFile {
    public static void main(String[] args) {
        /*String filePath = ".\\.gitignore";
        File file = new File(filePath);
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException("Error", e);
        }

        File dir = new File("./basejava/src/com/urise/webapp");
        System.out.println(dir.isDirectory());
        String[] list = dir.list();
        if (list != null) {
            for(String name : list) {
                System.out.println(name);
            }
        }

        try (FileInputStream fis = new FileInputStream(filePath)){
            System.out.println(fis.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        File file = new File("D:\\MyProjects\\javab");
        recurso(file);



    }
    private static void recurso(File file) {
        if (file.isDirectory()){
            System.out.println(file);
            File[] list = file.getAbsoluteFile().listFiles();
            for (File name : Objects.requireNonNull(list)) {
                if (!name.isDirectory()) System.out.println(name.getName());
            }
            for(File name : Objects.requireNonNull(list)) {
                if (name.isDirectory()) recurso(name);
            }
        }
    }
}
