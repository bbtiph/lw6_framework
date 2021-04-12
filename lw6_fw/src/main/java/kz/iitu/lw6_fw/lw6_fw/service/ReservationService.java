package kz.iitu.lw6_fw.lw6_fw.service;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Reservation;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;

import java.util.List;

public interface ReservationService {
    Reservation issueBook(Users user, Book book, int countDay);
    List<Reservation> booksInBasket(Users user);
    List<Reservation> findAll();
    void returnBook(Users user, Book book);
}
