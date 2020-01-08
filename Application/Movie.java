package Application;

import java.util.*;
import java.util.ArrayList;

public class Movie {

	private String title;
	private String description;
	private Float rating;
	private Collection<ArrayList<String>> opinions;

	/**
	 * 
	 * @param title
	 * @param description
	 */
	public Movie(String title, String description) {
		// TODO - implement Movie.Movie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rate
	 * @param opinion
	 */
	public void addRating(Float rate, String opinion) {
		// TODO - implement Movie.addRating
		throw new UnsupportedOperationException();
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Float getRating() {
		return this.rating;
	}

	/**
	 * 
	 * @param rating
	 */
	public void setRating(Float rating) {
		this.rating = rating;
	}

	public ArrayList<String> getOpinions() {
		return this.opinions;
	}

	/**
	 * 
	 * @param opinions
	 */
	public void setOpinions(ArrayList<String> opinions) {
		this.opinions = opinions;
	}

}