package kz.iitu.lw6_fw.lw6_fw.service;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;

public interface BookService {
    void availableBooks();
    Book findById(int id);
    void updateBook(Book book);
}
