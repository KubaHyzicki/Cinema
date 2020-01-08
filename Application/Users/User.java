package Application.Users;

public abstract class User {

	protected LoginDetails loginDetails;
	protected Date dateOfBirth;

	public User() {
		// TODO - implement User.User
		throw new UnsupportedOperationException();
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

}