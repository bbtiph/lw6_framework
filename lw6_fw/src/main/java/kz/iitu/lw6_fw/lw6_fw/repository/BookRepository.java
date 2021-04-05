package kz.iitu.lw6_fw.lw6_fw.repository;

import kz.iitu.lw6_fw.lw6_fw.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByAvailable(boolean available);
    Book getById(int id);
}
