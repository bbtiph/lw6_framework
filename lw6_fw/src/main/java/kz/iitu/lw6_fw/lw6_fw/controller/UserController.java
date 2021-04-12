package kz.iitu.lw6_fw.lw6_fw.controller;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Reservation;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import kz.iitu.lw6_fw.lw6_fw.service.BookService;
import kz.iitu.lw6_fw.lw6_fw.service.ReservationService;
import kz.iitu.lw6_fw.lw6_fw.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;

    @GetMapping("/main")
    public String main() {
       return "Main page";
    }

    @GetMapping("/validation")
    public Users validationUser(@RequestParam String log,
                                @RequestParam String pass) {
        return userService.validationUser(log, pass);
    }

    @GetMapping("/makeissue")
    public Reservation makeIssue(@RequestBody Users user,
                                 @RequestBody Book book,
                                 @RequestParam int countDay) {
        reservationService.issueBook(user, book, countDay);
        book.setAvailable(false);
        bookService.updateBook(book);
        return null;
    }

    @GetMapping("/booksinbasket")
    public List<Reservation> booksInBasket(@RequestBody Users user){
        return reservationService.booksInBasket(user);
    }
    @PatchMapping("/changepass")
    public Users changePassword(Users user, String pass) {
        return userService.changePass(user,pass);
    }


}
