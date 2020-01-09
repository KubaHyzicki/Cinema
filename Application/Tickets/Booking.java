package Application.Tickets;

import Application.*;
import Application.DataAccess.TicketDB;
import Application.Users.*;
import java.util.Date;
import java.sql.Time;

public class Booking {

	private Ticket ticket;

	public Booking() {

	}

	/**
	 * 
	 * @param customer
	 * @param movie
	 * @param screeningDate
	 * @param time
	 */
	public Ticket bookTicket(Customer customer, Movie movie, Date screeningDate, Time time) {
		//Polaczenie z Baza danych
		TicketDB ticketDB = new TicketDB() {
			@Override
			public void addTicket(Ticket ticket) {

			}

			@Override
			public void addTicketToUser(Ticket ticket, User user) {

			}

			@Override
			public void modifyTicket(Ticket ticket) {

			}
		};

		float price = movie.getPrice();

		Ticket ticket = new Ticket(movie, screeningDate, price);

		ticket.setWasPaid(false);

		try {
			//Dodanie biletu do bazy danych
			 ticketDB.addTicket(ticket);
		} catch (Exception exc) {
			return null;
		}

		return ticket;
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
