package Application.DataAccess;

import Application.*;
import java.util.Date;
import java.util.ArrayList;

public interface DisplayedMoviesDB {

	/**
	 * 
	 * @param date
	 */
	ArrayList<Movie> loadMovies(Date date);

}