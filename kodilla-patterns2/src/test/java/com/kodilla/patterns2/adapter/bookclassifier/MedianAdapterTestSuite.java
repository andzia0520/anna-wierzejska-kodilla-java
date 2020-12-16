package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Henryk Sienkiewicz", "Potop", 1886, "01"));
        bookSet.add(new Book("Henryk Sienkiewicz", "Quo vadis", 1895, "01"));
        bookSet.add(new Book("Bolesław Prus", "Lalka", 1890, "01"));
        bookSet.add(new Book("Władysław Stanisław Reymont", "Chłopi", 1904, "01"));
        bookSet.add(new Book("Władysław Stanisław Reymont", "Ziemia obiecana", 1899, "01"));

        //When
        int publicationsYearMedian = medianAdapter.publicationsYearMedian(bookSet);

        //Then
        System.out.println(publicationsYearMedian);
        assertEquals(publicationsYearMedian, 1895);
    }
}
