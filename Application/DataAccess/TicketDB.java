package Application.DataAccess;

import Application.*;
import Application.Users.*;
import Application.Tickets.*;

import java.sql.SQLException;

public interface TicketDB {

	/**
	 * 
	 * @param ticket
	 */
	void addTicket(Ticket ticket) throws SQLException;

	/**
	 * 
	 * @param ticket
	 * @param user
	 */
	void addTicketToUser(Ticket ticket, User user) throws SQLException;

	/**
	 * 
	 * @param ticket
	 */
	void modifyTicket(Ticket ticket) throws SQLException;

}
