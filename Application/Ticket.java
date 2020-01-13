package Application;
import java.util.Date;
import java.sql.Time;
import java.util.Objects;

public class Ticket {

	private int reservationNo;
	private Movie movie;
	private Date date;
	private Float price;
	private boolean wasPaid;
	private boolean wasUsed;

	/**
	 * 
	 * @param movie
	 * @param date
	 * @param price
	 */
	public Ticket(Movie movie, Date date, Float price) {
		this.movie = movie;
		this.date = date;
		this.price = price;
	}

	public int getReservationNo() {
		return this.reservationNo;
	}

	/**
	 * 
	 * @param reservationNo
	 */
	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public Movie getMovie() {
		return this.movie;
	}

	/**
	 * 
	 * @param movie
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
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

	public Float getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	public boolean getWasPaid() {
		return this.wasPaid;
	}

	/**
	 * 
	 * @param wasPaid
	 */
	public void setWasPaid(boolean wasPaid) {
		this.wasPaid = wasPaid;
	}

	public boolean getWasUsed() {
		return this.wasUsed;
	}

	/**
	 * 
	 * @param wasUsed
	 */
	public void setWasUsed(boolean wasUsed) {
		this.wasUsed = wasUsed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ticket ticket = (Ticket) o;
		return reservationNo == ticket.reservationNo &&
				wasPaid == ticket.wasPaid &&
				wasUsed == ticket.wasUsed &&
				movie.equals(ticket.movie) &&
				date.equals(ticket.date) &&
				price.equals(ticket.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(reservationNo, movie, date, price, wasPaid, wasUsed);
	}
}