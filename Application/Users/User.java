package Application.Users;
import java.util.Date;

public abstract class User {

	protected LoginDetails loginDetails;
	protected Date dateOfBirth;

	public User() {

	}

	/**
	 * 
	 * @param loginDetails
	 */
	public void changeLoginDetails(LoginDetails loginDetails) {
		// TODO - implement User.changeLoginDetails
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newEmail
	 */
	public boolean changeEmailAddress(String newEmail) {
		// TODO - implement User.changeEmailAddress
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param oldPassword
	 * @param newPassword
	 */
	public boolean changePassword(String oldPassword, String newPassword) {
		// TODO - implement User.changePassword
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateOfBirth
	 */
	public void changeDateOfBirth(Date dateOfBirth) {
		// TODO - implement User.changeDateOfBirth
		throw new UnsupportedOperationException();
	}

	public LoginDetails getLoginDetails() {
		return this.loginDetails;
	}

	/**
	 * 
	 * @param loginDetails
	 */
	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * 
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
