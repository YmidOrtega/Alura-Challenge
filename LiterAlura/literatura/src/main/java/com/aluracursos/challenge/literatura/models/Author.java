package com.aluracursos.challenge.literatura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double birthYear;
    private double deathYear;

    @ManyToOne
    private Book book;

    public Author() {
    }

    public Author(DataAuthor dataAuthor) {
        this.name = dataAuthor.name();
        this.birthYear = dataAuthor.birthYear();
        this.deathYear = dataAuthor.deathYear();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(double birthYear) {
        this.birthYear = birthYear;
    }

    public double getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(double deathYear) {
        this.deathYear = deathYear;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
