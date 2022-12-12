package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {
    @Autowired
    @Qualifier("toDoList")
    public TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    public TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    public TaskList doneList;

}
