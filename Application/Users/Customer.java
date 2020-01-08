package Application.Users;

import java.util.*;
import Application.*;
import java.util.ArrayList;

public class Customer extends User {

	private Collection<ArrayList<Ticket>> tickets;

	/**
	 * 
	 * @param loginDetails
	 * @param dateOfBirth
	 */
	public Customer(LoginDetails loginDetails, Date dateOfBirth) {
		// TODO - implement Customer.Customer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ticket
	 */
	public void addTicket(Ticket ticket) {
		// TODO - implement Customer.addTicket
		throw new UnsupportedOperationException();
	}

	public Collection<ArrayList<Ticket>> getTickets() {
		return this.tickets;
	}

	/**
	 * 
	 * @param tickets
	 */
	public void setTickets(Collection<ArrayList<Ticket>> tickets) {
		this.tickets = tickets;
	}

}