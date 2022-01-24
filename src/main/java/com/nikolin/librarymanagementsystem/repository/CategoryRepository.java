package com.nikolin.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikolin.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
