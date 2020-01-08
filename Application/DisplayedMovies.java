package Application;

import java.util.*;
import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;

public class DisplayedMovies {

	private Collection<ArrayList<Movie>> movies;
	private Date date;

	public DisplayedMovies() {
		// TODO - implement DisplayedMovies.DisplayedMovies
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public void loadMovies(Date date) {
		// TODO - implement DisplayedMovies.loadMovies
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 */
	public ArrayList<Time> getScreeningHours(Movie movie) {
		// TODO - implement DisplayedMovies.getScreeningHours
		throw new UnsupportedOperationException();
	}

	public ArrayList<Movie> getMovies() {
		return this.movies;
	}

	/**
	 * 
	 * @param movies
	 */
	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}