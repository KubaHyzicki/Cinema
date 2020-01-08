package Application;

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
		// TODO - implement Ticket.Ticket
		throw new UnsupportedOperationException();
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

}