package kz.iitu.lw6_fw.lw6_fw.repository;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import kz.iitu.lw6_fw.lw6_fw.entities.Reservation;
import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findByUser(Users user);
    void deleteByUserAndBook(Users user, Book book);
}
