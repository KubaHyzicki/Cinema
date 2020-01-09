package Application.Users;

import java.util.*;
import Application.*;
import java.util.ArrayList;
import Application.Tickets.*;

public class Customer extends User {

	private ArrayList<Ticket> tickets;

	/**
	 * 
	 * @param loginDetails
	 * @param dateOfBirth
	 */
	public Customer(LoginDetails loginDetails, Date dateOfBirth) {
		super.setLoginDetails(loginDetails);
		super.setDateOfBirth(dateOfBirth);

		tickets = new ArrayList<Ticket>();
	}

	/**
	 * 
	 * @param ticket
	 */
	public void addTicket(Ticket ticket) {

		boolean contains = tickets.contains(ticket);

		if(!contains)
			tickets.add(ticket);

	}

	public ArrayList<Ticket> getTickets() {
		return this.tickets;
	}

	/**
	 * 
	 * @param tickets
	 */
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

}
