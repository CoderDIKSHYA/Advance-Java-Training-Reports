package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.dao.MovieDaoI;
import com.capg.springboot.entities.Movie;

/*
STEP 19:
@Service annotation marks this class
as a Service component in Spring Boot.
*/

@Service
public class MovieServiceImpl implements MovieServiceI {

	// Dependency Injection
	@Autowired
	MovieDaoI dao;

	@Override
	public Movie addMovie(Movie movie) {

		return dao.addMovie(movie);
	}

	@Override
	public List<Movie> getAllMovies() {

		return dao.getAllMovies();
	}

	@Override
	public Movie getMovieById(int id) {

		return dao.getMovieById(id);
	}

	@Override
	public Movie updateMovie(int id, Movie movie) {

		return dao.updateMovie(id, movie);
	}

	@Override
	public String deleteMovie(int id) {

		return dao.deleteMovie(id);
	}
}