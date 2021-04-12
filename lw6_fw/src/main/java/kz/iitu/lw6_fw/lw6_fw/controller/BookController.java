package kz.iitu.lw6_fw.lw6_fw.controller;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.service.BookService;
import kz.iitu.lw6_fw.lw6_fw.service.ReservationService;
import kz.iitu.lw6_fw.lw6_fw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        return bookService.findById(id);
    }


    @GetMapping("/availablebooks")
    public List<Book> availableBooks() {
        return bookService.availableBooks();
    }

    @PutMapping("updatebook")
    public Book updateBook(@PathVariable int id,
                           @RequestBody Book book) {
        book.setId(id);
        return bookService.updateBook(book);
    }

}
