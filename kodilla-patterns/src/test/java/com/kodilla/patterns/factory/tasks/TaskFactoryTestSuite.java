package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping(){
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task shopping = factory.createTask(TaskFactory.SHOPPING);

        //then
        assertEquals("The shopping task", shopping.getTaskName());
    }

    @Test
    void testFactoryPainting(){
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task painting = factory.createTask(TaskFactory.PAINTING);

        //then
        assertEquals("The painting task", painting.getTaskName());
    }

    @Test
    void testFactoryDriving(){
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task driving = factory.createTask(TaskFactory.DRIVING);

        //then
        assertEquals("The driving task", driving.getTaskName());
    }
}
