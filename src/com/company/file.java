package com.company;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;  // Import this class to handle errors



public class file {
    public static void makeBookFile(String bookName) {
        try {
            File myObj = new File(bookName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void writeBookFile(String bookName, String description){
        try {
            FileWriter myWriter = new FileWriter(bookName+".txt");
            myWriter.write(description);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String bookFileRead(String bookName){
        try {
            File myObj = new File(bookName+".txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList total = new ArrayList();
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                total.add(data);
            }
            myReader.close();
            return String.join(", ", total);
        } catch (FileNotFoundException e) {
            System.out.println("The book you are trying to find isn't recorded on this system.");
            e.printStackTrace();
            return "ERROR";
        }
    }
}


