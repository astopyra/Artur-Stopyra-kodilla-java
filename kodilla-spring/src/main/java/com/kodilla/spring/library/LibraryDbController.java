package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;


public class LibraryDbController {

    public void saveData(){
        System.out.println("Saving data to the base");
    }

    public void loadData(){
        System.out.println("Loading data from the base");
    }
}
