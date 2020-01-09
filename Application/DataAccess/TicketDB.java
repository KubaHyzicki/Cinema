package Application.DataAccess;

import Application.*;
import Application.Users.*;
import Application.Tickets.*;

public interface TicketDB {

	/**
	 * 
	 * @param ticket
	 */
	void addTicket(Ticket ticket);

	/**
	 * 
	 * @param ticket
	 * @param user
	 */
	void addTicketToUser(Ticket ticket, User user);

	/**
	 * 
	 * @param ticket
	 */
	void modifyTicket(Ticket ticket);

}
