package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entities.Movie;

/*
STEP 18:
Service layer contains business logic.

It acts as a bridge between Controller and DAO layer.
*/

public interface MovieServiceI {

	Movie addMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie getMovieById(int id);

	Movie updateMovie(int id, Movie movie);

	String deleteMovie(int id);

}