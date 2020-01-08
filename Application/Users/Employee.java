package Application.Users;
import java.util.Date;

public class Employee extends User {

	private String name;
	private String lastName;
	private int employeeNo;

	/**
	 * 
	 * @param loginDetails
	 * @param dateOfBirth
	 */
	public Employee(LoginDetails loginDetails, Date dateOfBirth) {
		// TODO - implement Employee.Employee
		throw new UnsupportedOperationException();
	}

	public void changeProfile() {
		// TODO - implement Employee.changeProfile
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeNo() {
		return this.employeeNo;
	}

	/**
	 * 
	 * @param employeeNo
	 */
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

}