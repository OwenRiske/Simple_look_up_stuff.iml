package com.company;



public class books {

    public static String makeBook(String bookName, String description){
        file.makeBookFile(bookName);
        file.writeBookFile(bookName, description);
        return bookName;
    }



}
