package pl.librarypro2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

//    @Column(name = "title")
    private String title;

    private String bookCode;
//    @Column(name = "author")
    private String author;

//    @Column(name = "publishing_house")
    private String publishingHouse;

//    @Column(name = "publication_date")
    private LocalDate publicationDate;

//    @Column(name = "description")
    private String description;

//    @Column(name = "bookshelf_number")
    private int bookshelfNumber;

//    @Column(name = "shelf_number")
    private int shelfNumber;

    public Book() {
    }


    public Book(String title, String author, String publishingHouse, LocalDate publicationDate, String description, int bookshelfNumber, int shelfNumber) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publicationDate = publicationDate;
        this.description = description;
        this.bookshelfNumber = bookshelfNumber;
        this.shelfNumber = shelfNumber;
    }


}
