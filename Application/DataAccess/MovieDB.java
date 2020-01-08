package Application.DataAccess;

import Application.*;

public interface MovieDB {

	/**
	 * 
	 * @param movie
	 */
	void addMovie(Movie movie);

	/**
	 * 
	 * @param movie
	 */
	void removeMovie(Movie movie);

	/**
	 * 
	 * @param movieName
	 */
	ArrayList<Movie> findMovie(String movieName);

	/**
	 * 
	 * @param movie
	 */
	ArrayList<Time> getScreeningHours(Movie movie);

}