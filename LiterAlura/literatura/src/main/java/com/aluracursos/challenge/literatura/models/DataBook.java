package com.aluracursos.challenge.literatura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBook(
        @JsonAlias("title") String title,
        @JsonAlias("authors") DataAuthor author,
        @JsonAlias("subjects") String[] subjects,
        @JsonAlias("bookshelves") String[] bookshelves,
        @JsonAlias("languages") String[] languages,
        @JsonAlias("copyright") String copyright,
        @JsonAlias("download_count") Long downloadCount

) {
}
