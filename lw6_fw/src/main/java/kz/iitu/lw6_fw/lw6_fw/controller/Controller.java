package kz.iitu.lw6_fw.lw6_fw.controller;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import kz.iitu.lw6_fw.lw6_fw.service.BookService;
import kz.iitu.lw6_fw.lw6_fw.service.ReservationService;
import kz.iitu.lw6_fw.lw6_fw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;

    public Users validationUser() {
        return userService.validationUser();
    }

    public void availableBooks() {
        bookService.availableBooks();
    }

    public void issueBook(Users user, Book book){
        reservationService.issueBook(user, book);
        book.setAvailable(false);
        bookService.updateBook(book);
    }

    public Book getById(int id) {
       return bookService.findById(id);
    }

    public void booksInBasket(Users user){
        reservationService.booksInBasket(user);
    }

    public void findAll() {
        reservationService.findAll();
    }

    public void returnBook(Users users, Book book){
        reservationService.returnBook(users, book);
    }
}
