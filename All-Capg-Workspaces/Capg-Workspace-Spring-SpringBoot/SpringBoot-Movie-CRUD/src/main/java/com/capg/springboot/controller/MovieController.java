package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.entities.Movie;
import com.capg.springboot.service.MovieServiceI;

/*
STEP 20:
Controller layer handles HTTP requests
from client applications (Postman / Browser).
*/

@RestController
public class MovieController {

	@Autowired
	MovieServiceI service;

	// Add Movie
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie movie) {

		return service.addMovie(movie);
	}

	// Get All Movies
	@GetMapping("/movies")
	public List<Movie> getAllMovies() {

		return service.getAllMovies();
	}

	// Get Movie By ID
	@GetMapping("/movie/{id}")
	public Movie getMovie(@PathVariable int id) {

		return service.getMovieById(id);
	}

	// Update Movie
	@PutMapping("/movie/{id}")
	public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {

		return service.updateMovie(id, movie);
	}

	// Delete Movie
	@DeleteMapping("/movie/{id}")
	public String deleteMovie(@PathVariable int id) {

		return service.deleteMovie(id);
	}
}