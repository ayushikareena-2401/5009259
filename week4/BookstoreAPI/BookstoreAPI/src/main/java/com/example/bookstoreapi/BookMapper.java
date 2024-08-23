package com.example.bookstoreapi;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO toDTO(Book book);
    Book toEntity(BookDTO bookDTO);
}
