package Application.Tickets;

import Application.*;
import Application.DataAccess.TicketDB;
import Application.Users.*;

import java.sql.SQLException;
import java.util.Date;
import java.sql.Time;

public class Booking {

	private Ticket ticket;
	private TicketDB ticketDB;

	public Booking(TicketDB ticketDB) {
		this.ticketDB = ticketDB;
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
		System.out.print("Get ticket price\n");
		float price = movie.getPrice();

		System.out.print("Creating ticket\n");
		Ticket ticket = new Ticket(movie, screeningDate, price);
		System.out.print("setWasPaid=false\n");
		ticket.setWasPaid(false);

		try {
			//Dodanie biletu do bazy danych
			System.out.print("Add ticket to database\n");
			ticketDB.addTicket(ticket);
		} catch (Exception exc) {
			exc.printStackTrace();
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

	public TicketDB getTicketDB() {
		return ticketDB;
	}

	public void setTicketDB(TicketDB ticketDB) {
		this.ticketDB = ticketDB;
	}
}
