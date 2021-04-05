package kz.iitu.lw6_fw.lw6_fw.service;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;

public interface ReservationService {
    void issueBook(Users user, Book book);
    void booksInBasket(Users user);
    void findAll();
    void returnBook(Users user, Book book);
}
