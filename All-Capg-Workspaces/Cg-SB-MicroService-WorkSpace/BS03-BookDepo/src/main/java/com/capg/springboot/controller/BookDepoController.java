package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.client.RestTemplate;

import com.capg.springboot.dto.Book;
import com.capg.springboot.dto.Rating;
import com.capg.springboot.dto.BookDepo;

@RestController
@RequestMapping("/info")
public class BookDepoController {

    RestTemplate rest = new RestTemplate();

    // http://localhost:9098/info/list/101
    @RequestMapping("/list/{id}")
    public BookDepo getAllData(@PathVariable int id) {

        Book book = rest.getForObject(
                "http://localhost:9096/catalog/list",
                Book.class);

        Rating rating = rest.getForObject(
                "http://localhost:9097/rating/" + id,
                Rating.class);

        BookDepo info = new BookDepo();

        info.setBookId(book.getBookId());
        info.setBookName(book.getBookName());
        info.setBookRating(rating.getBookRating());

        return info;
    }
}