package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //TaskList taskToDo = (TaskList) context.getBean("toDoList");

        //when
        board.toDoList.addTask("send an email");
        board.doneList.addTask("read a message");
        board.inProgressList.addTask("write a letter");

        //then
        System.out.println("****************************************************");
        System.out.println(board.doneList.toString());
        System.out.println(board.inProgressList.toString());
        System.out.println(board.toDoList.toString());

    }
}
