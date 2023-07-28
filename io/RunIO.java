package com.qa.io;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class RunIO {
    public static void main(String[] args) {

        File file = new File("./poem.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;
            while ((line = reader.readLine()) != null )
               System.out.println(line);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File writeFile = new File("./writePeom.txt");

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(writeFile, true))) {
            writer.println("Hello World!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
