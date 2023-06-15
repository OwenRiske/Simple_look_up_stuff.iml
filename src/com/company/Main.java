package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        books.makeBook("Harry Potter","Wizard Child");

        while (true) {
            System.out.println("\n\nWhich book would you like to look at?");
            String userInput = INPUT.nextLine();

            System.out.println(file.bookFileRead(userInput));
        }
    }
}
