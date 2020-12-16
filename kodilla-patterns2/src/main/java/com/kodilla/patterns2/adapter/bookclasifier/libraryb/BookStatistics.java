package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationsYear(Map<BookSignature, Book> books);

    int medianPublicationsYear(Map<BookSignature, Book> books);
}
