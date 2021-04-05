package kz.iitu.lw6_fw.lw6_fw.service.Impl;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Reservation;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import kz.iitu.lw6_fw.lw6_fw.repository.ReservationRepository;
import kz.iitu.lw6_fw.lw6_fw.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    Scanner in = new Scanner(System.in);
    @Override
    public void issueBook(Users user, Book book) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String curdate = dateFormat.format(cal.getTime());

        System.out.println("Enter count of day: ");
        int countDay = in.nextInt();

        //return date
        cal.add(Calendar.DATE, countDay);
        String returnData = dateFormat.format(cal.getTime());

        Reservation reservation  = new Reservation();
        reservation.setDateReturn(returnData);
        reservation.setDateIssue(curdate);
        reservation.setBook(book);
        reservation.setUser(user);
        reservationRepository.save(reservation);
        System.out.println(reservation);
    }

    @Override
    public void booksInBasket(Users user) {
        System.out.println(reservationRepository.findByUser(user));
    }

    @Override
    public void findAll() {
        System.out.println(reservationRepository.findAll());
    }

    @Override
    public void returnBook(Users user, Book book) {
        reservationRepository.deleteByUserAndBook(user, book);
    }
}
