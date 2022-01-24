package com.nikolin.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikolin.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
