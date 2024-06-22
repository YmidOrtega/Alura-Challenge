package com.aluracursos.challenge.literatura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataAuthor(

        @JsonAlias("name") String name,
        @JsonAlias("birth_year") double birthYear,
        @JsonAlias("death_year") double deathYear
) {}
