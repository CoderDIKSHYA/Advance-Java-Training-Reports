package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.springboot.dto.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @RequestMapping("/{id}")
    public Rating getRating(@PathVariable int id) {

        Rating rating = new Rating();
        rating.setBookId(id);
        rating.setBookRating(5.0);

        return rating;
    }
}