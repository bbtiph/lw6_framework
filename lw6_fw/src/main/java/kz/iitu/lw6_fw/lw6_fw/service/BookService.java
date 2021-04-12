package kz.iitu.lw6_fw.lw6_fw.service;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> availableBooks();
    Book findById(int id);
    Book updateBook(Book book);
}
