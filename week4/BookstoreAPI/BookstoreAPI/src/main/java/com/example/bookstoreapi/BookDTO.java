package com.example.bookstoreapi;

public class BookDTO {
    @JsonProperty("book_id")
    private Long id;

    private String title;
    private String author;

    @JsonIgnore
    private Double price;

    // Getters and Setters
}

