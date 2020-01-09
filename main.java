import Application.*;
import Application.Users.Customer;
import Application.Users.LoginDetails;

import java.util.*;
import java.sql.Time;

class App {
	public static void main(String[] args){
		Cinema cinema = new Cinema();

		Customer customer = new Customer(new LoginDetails("jakubfaldasz", "passw0rd", "jakubfaldasz@gmail.com"), new Date(1997, 5,13));
		cinema.setUser(customer);
		Movie movie = new Movie("Pokahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
		Date screeningDate = new Date(2020, 2, 10);
		Time time = new Time(13, 13, 13);
		cinema.bookTicket(customer, movie, screeningDate, time);
		// cinema.run();
	}
}
