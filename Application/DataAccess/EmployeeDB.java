package Application.DataAccess;

import Application.Users.*;

public interface EmployeeDB {

	/**
	 * 
	 * @param employee
	 */
	void addEmployee(Employee employee);

	/**
	 * 
	 * @param employee
	 */
	void removeEmployee(Employee employee);

	/**
	 * 
	 * @param employeeNo
	 */
	Employee findEmployee(int employeeNo);

	/**
	 * 
	 * @param employee
	 */
	void modifyEmployee(Employee employee);

}