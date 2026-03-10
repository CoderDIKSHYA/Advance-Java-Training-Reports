package com.capg.springboot.entities;

/*
STEP 4:
Entity class represents the data model of the application.

This class defines Movie attributes which will be used
throughout the application.
*/

public class Movie {

	// STEP 5: Declare attributes
	private int movieId;
	private String movieName;
	private String genre;
	private double rating;

	// STEP 6: Default constructor
	public Movie() {}

	// STEP 7: Parameterized constructor
	public Movie(int movieId, String movieName, String genre, double rating) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.rating = rating;
	}

	// STEP 8: Getter and Setter methods

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}