package Application;

import Application.Users.*;

public class Cinema {

	DisplayedMovies diplayedMovies;
	private User user;
	private boolean loggedIn;
	private DisplayedMovies displayedMovies;
	private CustomerService customerService;
	private EmployeeManagement employeeManagement;

	public Cinema() {
		// TODO - implement Cinema.Cinema
		throw new UnsupportedOperationException();
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
		// TODO - implement Cinema.bookTicket
		throw new UnsupportedOperationException();
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
		// TODO - implement Cinema.addTicketToUserAccount
		throw new UnsupportedOperationException();
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

}