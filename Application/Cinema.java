package Application;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

import Application.DataAccess.*;
import Application.Tickets.Booking;
import Application.Users.*;
import Application.Tickets.*;

public class Cinema {

	DisplayedMovies diplayedMovies;
	private User user;
	private boolean loggedIn;
	private DisplayedMovies displayedMovies;
	private CustomerService customerService;
	private EmployeeManagement employeeManagement;

	public Cinema() {
	}

	/**
	 * 
	 * @param displayedMovies
	 * @param date
	 */
	public void seeWhatsOn(DisplayedMovies displayedMovies, Date date) {
		// TODO - implement Cinema.seeWhatsOn
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 */
	public void chooseMovie(Movie movie) {
		// TODO - implement Cinema.chooseMovie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 */
	public void checkScreeningHours(Movie movie) {
		// TODO - implement Cinema.checkScreeningHours
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 * @param rate
	 * @param description
	 */
	public boolean rateMovie(Movie movie, Float rate, String description) {
		// TODO - implement Cinema.rateMovie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customer
	 * @param movie
	 * @param screeningDate
	 * @param time
	 */
	public boolean bookTicket(Customer customer, Movie movie, Date screeningDate, Time time) {
		System.out.print("Ignoring loggedIn & hasAvailableSeats, to be replaced by Mock later\n");
		// if(loggedIn == false || ! hasAvailableSeats(movie, screeningDate, time))
		// 	return false;

		Booking booking = new Booking();

		Ticket ticket = booking.bookTicket(customer, movie, screeningDate, time);

		if(ticket != null) {
			System.out.print("Add ticket to user account\n");
			addTicketToUserAccount(ticket);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param customer
	 * @param movie
	 * @param screeningDate
	 * @param time
	 */
	public Boolean buyTicket(Customer customer, Movie movie, Date screeningDate, Time time) {
		// TODO - implement Cinema.buyTicket
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ticket
	 */
	public void addTicketToUserAccount(Ticket ticket) {

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

		ticketDB.addTicketToUser(ticket, user);

		Customer customer = (Customer) user;
		customer.addTicket(ticket);

	}

	public void changeProfile() {
		// TODO - implement Cinema.changeProfile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userLogin
	 * @param userPassword
	 */
	public boolean login(String userLogin, String userPassword) {
		// TODO - implement Cinema.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param loginDetails
	 */
	public boolean register(LoginDetails loginDetails) {
		// TODO - implement Cinema.register
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 */
	public ArrayList<Time> getScreeningHours(Movie movie) {
		// TODO - implement Cinema.getScreeningHours
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userEmail
	 * @param fieldName
	 * @param newValue
	 */
	public boolean modifyCustomer(String userEmail, String fieldName, String newValue) {
		// TODO - implement Cinema.modifyCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userEmail
	 */
	private ArrayList<Customer> searchForCustomer(String userEmail) {
		// TODO - implement Cinema.searchForCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationNo
	 */
	public boolean confirmReservation(int reservationNo) {
		// TODO - implement Cinema.confirmReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qrCode
	 */
	public boolean confirmReservation(BufferedImage qrCode) {
		// TODO - implement Cinema.confirmReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param message
	 */
	public boolean sendMassMessages(String message) {
		// TODO - implement Cinema.sendMassMessages
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employee
	 */
	public boolean addEmployee(Employee employee) {
		// TODO - implement Cinema.addEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employee
	 */
	public boolean removeEmployee(Employee employee) {
		// TODO - implement Cinema.removeEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 */
	public boolean removeMovie(Movie movie) {
		// TODO - implement Cinema.removeMovie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movie
	 */
	public boolean addMovie(Movie movie) {
		// TODO - implement Cinema.addMovie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param movieName
	 */
	public ArrayList<Movie> findMovie(String movieName) {
		// TODO - implement Cinema.findMovie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employeeNo
	 */
	public Employee findEmployee(int employeeNo) {
		// TODO - implement Cinema.findEmployee
		throw new UnsupportedOperationException();
	}

	public User getUser() {
		return this.user;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public boolean getLoggedIn() {
		return this.loggedIn;
	}

	/**
	 * 
	 * @param loggedIn
	 */
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public DisplayedMovies getDisplayedMovies() {
		return this.displayedMovies;
	}

	/**
	 * 
	 * @param displayedMovies
	 */
	public void setDisplayedMovies(DisplayedMovies displayedMovies) {
		this.displayedMovies = displayedMovies;
	}

	public CustomerService getCustomerService() {
		return this.customerService;
	}

	/**
	 * 
	 * @param customerService
	 */
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public EmployeeManagement getEmployeeManagement() {
		return this.employeeManagement;
	}

	/**
	 * 
	 * @param employeeManagement
	 */
	public void setEmployeeManagement(EmployeeManagement employeeManagement) {
		this.employeeManagement = employeeManagement;
	}

	private boolean hasAvailableSeats(Movie movie, Date screeningDate, Time time) {
		// sprawdzanie wolnych miejsc

		return true;

	}

}
