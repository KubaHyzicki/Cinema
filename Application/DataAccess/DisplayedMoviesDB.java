package Application.DataAccess;

import Application.*;

public interface DisplayedMoviesDB {

	/**
	 * 
	 * @param date
	 */
	ArrayList<Movie> loadMovies(Date date);

}