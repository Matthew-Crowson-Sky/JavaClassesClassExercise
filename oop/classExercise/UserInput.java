package com.qa.oop.classExercise;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput implements Closeable {
    Scanner scanner;

    public UserInput(){
        this.scanner = new Scanner(System.in);
    }
    public UserInput(InputStream inputStream){
        this.scanner = new Scanner(inputStream);
    }

    public int getPositiveInt(){
        int num = -1;
        do {
            try {
                if (scanner.hasNext())
                    num = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception){
                System.out.println("A positive integer must be supplied");
            }
        } while (num < 0);
        return num;
    }

    public String getString(){
        return scanner.next();
    }

    @Override
    public void close() throws IOException {
        this.scanner.close();
    }
}
