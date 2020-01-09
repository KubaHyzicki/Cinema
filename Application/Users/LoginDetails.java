package Application.Users;

import java.util.*;

public class LoginDetails {

	Collection<Customer> has;
	private String userLogin;
	private String userPassword;
	private String userEmail;

	/**
	 * 
	 * @param userLogin
	 * @param userPassword
	 * @param emailAddress
	 */
	public LoginDetails(String userLogin, String userPassword, String emailAddress) {
		this.userLogin = userLogin;
		this.userPassword = userPassword;
		this.userEmail = emailAddress;
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	/**
	 * 
	 * @param userLogin
	 */
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	/**
	 * 
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	/**
	 * 
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
