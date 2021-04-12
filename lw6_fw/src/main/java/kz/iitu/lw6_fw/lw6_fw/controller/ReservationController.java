package kz.iitu.lw6_fw.lw6_fw.controller;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Reservation;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import kz.iitu.lw6_fw.lw6_fw.service.BookService;
import kz.iitu.lw6_fw.lw6_fw.service.ReservationService;
import kz.iitu.lw6_fw.lw6_fw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }
    @GetMapping("/returnbook")
    public void returnBook(@RequestBody Users users,
                           @RequestBody Book book){
        reservationService.returnBook(users, book);
    }

}
