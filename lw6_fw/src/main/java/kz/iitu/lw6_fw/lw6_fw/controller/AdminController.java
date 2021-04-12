package kz.iitu.lw6_fw.lw6_fw.controller;

import kz.iitu.lw6_fw.lw6_fw.service.BookService;
import kz.iitu.lw6_fw.lw6_fw.service.ReservationService;
import kz.iitu.lw6_fw.lw6_fw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;

}
