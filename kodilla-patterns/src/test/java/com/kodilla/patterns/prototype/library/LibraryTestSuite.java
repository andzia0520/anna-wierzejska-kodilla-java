package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book bookJava = new Book("Java", "John Smith", LocalDate.of(2014, 5, 1));
        Book bookBootCamp = new Book("Bootcamp", "Alan Wayne", LocalDate.of(2019, 7, 3));
        Book bookCourse = new Book("Course", "Dorothy Bullock", LocalDate.of(2016, 8, 8));

        Library library = new Library("Library number 1");
        library.getBooks().add(bookJava);
        library.getBooks().add(bookBootCamp);
        library.getBooks().add(bookCourse);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(bookJava);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
        System.out.println(library);
        System.out.println(clonedLibrary);
    }
}

