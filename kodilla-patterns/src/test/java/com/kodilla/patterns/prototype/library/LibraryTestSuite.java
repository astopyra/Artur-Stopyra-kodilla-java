package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //given
        Book book1 = new Book("title1", "author1", LocalDate.of(2001,1,1));
        Book book2 = new Book("title2", "author2", LocalDate.of(2002,1,1));
        Book book3 = new Book("title3", "author3", LocalDate.of(2003,1,1));
        Book book4 = new Book("title4", "author4", LocalDate.of(2004,1,1));
        Book book5 = new Book("title5", "author5", LocalDate.of(2005,1,1));

        Library library = new Library("Library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //shallow copy
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book1);
        //then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertNotEquals(library.getBooks().size(), deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
    }
}
