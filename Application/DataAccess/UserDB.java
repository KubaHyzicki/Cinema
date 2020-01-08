package Application.DataAccess;

import Application.Users.*;

public interface UserDB {

	/**
	 * 
	 * @param userLogin
	 * @param userPassword
	 */
	boolean confirmLogin(String userLogin, String userPassword);

	/**
	 * 
	 * @param loginDetails
	 */
	boolean registerUser(LoginDetails loginDetails);

	/**
	 * 
	 * @param oldEmail
	 * @param newEmail
	 */
	boolean changeEmail(String oldEmail, String newEmail);

	/**
	 * 
	 * @param email
	 * @param oldPassword
	 * @param newPassword
	 */
	void changePassword(String email, String oldPassword, String newPassword);

}