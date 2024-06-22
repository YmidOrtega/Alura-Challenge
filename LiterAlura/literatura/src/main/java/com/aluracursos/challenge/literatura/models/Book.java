package com.aluracursos.challenge.literatura.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Author> author;

    @ElementCollection
    private List<String> subjects = new ArrayList<>();

    @ElementCollection
    private List<String> bookshelves = new ArrayList<>();

    @ElementCollection
    private List<String> languages = new ArrayList<>();

    private String copyright;
    private Long downloadCount;

    public Book() {
    }

    public Book(DataBook dataBook) {
        this.title = dataBook.title();
        this.subjects = List.of(dataBook.subjects());
        this.bookshelves = List.of(dataBook.bookshelves());
        this.languages = List.of(dataBook.languages());
        this.copyright = dataBook.copyright();
        this.downloadCount = dataBook.downloadCount();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public List<String> getBookshelves() {
        return bookshelves;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public String getCopyright() {
        return copyright;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }
}
