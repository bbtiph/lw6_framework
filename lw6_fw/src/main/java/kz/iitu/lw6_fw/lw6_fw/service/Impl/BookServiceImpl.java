package kz.iitu.lw6_fw.lw6_fw.service.Impl;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.repository.BookRepository;
import kz.iitu.lw6_fw.lw6_fw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void availableBooks() {
        System.out.println( bookRepository.findByAvailable(true) );
    }

    @Override
    public Book findById(int id) {
        return bookRepository.getById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
