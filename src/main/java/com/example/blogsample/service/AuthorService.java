package com.example.blogsample.service;

import com.example.blogsample.domain.Author;

import java.util.List;

public interface AuthorService {

    Author create(Author author);
    Author find(int id);
    List<Author> findAll();
}
