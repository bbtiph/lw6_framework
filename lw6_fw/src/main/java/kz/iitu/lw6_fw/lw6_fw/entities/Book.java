package kz.iitu.lw6_fw.lw6_fw.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String description;
    private boolean available;

    @OneToOne(mappedBy = "book", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Reservation reservation;


}
