package Application;

import java.util.*;
import java.util.ArrayList;

public class Movie {

	private String title;
	private String description;
	private float rating;
	private ArrayList<String> opinions;
	private float price;

	/**
	 * 
	 * @param title
	 * @param description
	 */
	public Movie(String title, String description) {
		this.title = title;
		this.description = description;
	}

    public Movie() {
        this.title="";
        this.description="";
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
	public void setRating(float rating) {
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

	public float getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Movie movie = (Movie) o;
		return Float.compare(movie.rating, rating) == 0 &&
				Float.compare(movie.price, price) == 0 &&
				title.equals(movie.title) &&
				Objects.equals(description, movie.description) &&
				Objects.equals(opinions, movie.opinions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, description, rating, opinions, price);
	}
}
