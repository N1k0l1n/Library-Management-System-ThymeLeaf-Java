package com.nikolin.librarymanagementsystem.service;

import java.util.List;

import com.nikolin.librarymanagementsystem.entity.Author;

public interface AuthorService {

	public List<Author> findAllAuthors();

	public Author findAuthorById(Long id);

	public void createAuthor(Author author);

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id);

}
