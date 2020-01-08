package Application.Tickets;

import Application.*;
import Application.Users.*;

public class Purchase {

	private Ticket ticket;

	/**
	 * 
	 * @param customer
	 * @param movie
	 * @param sreeningDate
	 * @param time
	 */
	public Ticket buyTicket(Customer customer, Movie movie, Date sreeningDate, Time time) {
		// TODO - implement Purchase.buyTicket
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ticket
	 */
	private boolean performTransaction(Ticket ticket) {
		// TODO - implement Purchase.performTransaction
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