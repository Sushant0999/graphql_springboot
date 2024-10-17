package com.graphql.tutorial;

import java.util.ArrayList;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount) {

    public static List<Book> books = new ArrayList<>();

    public static Book getBookById(Integer bookId) {
        return books.stream()
                .filter(ele -> ele.id.equals(bookId))
                .findFirst()
                .orElse(null);
    }

    public static Book getBookByName(String bookName) {
        return books.stream()
                .filter(ele -> ele.name.equals(bookName))
                .findFirst()
                .orElse(null);
    }

    public static Book addBook(String name, Integer pageCount) {
        int nextId = books.size() + 1;
        Book book = new Book(nextId, name, pageCount);
        books.add(book);
        return book;
    }
}
