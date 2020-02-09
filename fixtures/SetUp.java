package fixtures;

import Application.Cinema;
import Application.Movie;
import Application.Users.Customer;
import Application.Users.LoginDetails;
import Tests.Tickets.BookingTests;
import fit.Fixture;

import java.sql.Time;
import java.util.Date;

public class SetUp extends Fixture
{
	static Cinema cinema;
	static BookingTests bookingTests;
	static Customer customer;
	static Movie movie;
	static Date screeningDate;
	static Time time;
	public SetUp()
	{
		cinema = new Cinema();
		customer = new Customer(new LoginDetails("ciastek", "admin", "małpka@gmail.com"), new Date(1996, 11,24));
		cinema.setUser(customer);
		cinema.setLoggedIn(true);
		movie = new Movie("Pocahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
		screeningDate = new Date(2020, 2, 10);
		time = new Time(13, 13, 13);
	}

}