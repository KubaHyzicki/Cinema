import Application.*;
import Application.DataAccess.TicketDB;
import Application.Users.Customer;
import Application.Users.LoginDetails;
import Application.Users.User;

import Tests.*;
import Tests.Tickets.BookingTests;

import fit.Fixture;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import java.util.*;
import java.sql.Time;

class App {
	public static void main(String[] args){
		Cinema cinema = new Cinema(new TicketDB() {
			@Override
			public void addTicket(Ticket ticket) {

			}

			@Override
			public void addTicketToUser(Ticket ticket, User user) {

			}

			@Override
			public void modifyTicket(Ticket ticket) {

			}
		});

		Customer customer = new Customer(new LoginDetails("jakubfaldasz", "passw0rd", "jakubfaldasz@gmail.com"), new Date(1997, 5,13));
		cinema.setUser(customer);
		cinema.setLoggedIn(true);
		Movie movie = new Movie("Pocahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
		Date screeningDate = new Date(2020, 2, 10);
		Time time = new Time(13, 13, 13);
		if(cinema.bookTicket(customer, movie, screeningDate, time)){
			System.out.print("Succesfully booked ticket\n");
		}
		// cinema.run();
	}
}

class Tests {
	public static void main(String[] args){
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(BookingTests.class);
		junit.run(CinemaAddTicketToUserAccountTests.class);
		junit.run(CinemaBookTicketTests.class);
	}
}

