/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement.db;

/**
 *
 * @author sesanduramath
 */
public class BookDAO {
    
    private List<Book> books;

    public BookDAO() {
        this.books = new ArrayList<>();
        // Pre-load sample data
        books.add(new Book("B001", "Java Basics", true, "James Gosling", "Programming"));
        books.add(new Book("B002", "Clean Code", true, "Robert C. Martin", "Programming"));
        books.add(new Book("B003", "Design Patterns", true, "Erich Gamma", "Programming"));
    }
}
