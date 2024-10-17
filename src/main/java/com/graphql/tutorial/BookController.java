package com.graphql.tutorial;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @MutationMapping
    public Book addBook (@Argument String name, @Argument Integer pageCount){
        return Book.addBook(name, pageCount);
    }

    @QueryMapping
    public List<Book> books (){
        return Book.books;
    }

    @QueryMapping
    public Book bookById (@Argument Integer id){
        return Book.getBookById(id);
    }

    @QueryMapping
    public Book bookByName (@Argument String name){
        return Book.getBookByName(name);
    }

}
