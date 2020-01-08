package Application.Tickets;

import Application.*;
import Application.Users.*;

public class Booking {

	private Ticket ticket;

	public Booking() {
		// TODO - implement Booking.Booking
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customer
	 * @param movie
	 * @param screeningDate
	 * @param time
	 */
	public Ticket bookTicket(Customer customer, Movie movie, Date screeningDate, Time time) {
		// TODO - implement Booking.bookTicket
		throw new UnsupportedOperationException();
	}

	public Ticket getTicket() {
		return this.ticket;
	}

	/**
	 * 
	 * @param ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}