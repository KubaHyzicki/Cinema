package Tests;

import Application.Cinema;
import Application.DataAccess.*;
import Application.Movie;
import Application.Ticket;
import Application.Tickets.Booking;
import Application.Users.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.Date;

import static org.mockito.Mockito.*;

public class CinemaTests {
    private Cinema cinema;
    private TicketDB ticketDB;
    private Ticket ticket;

    @Before
    public void setUp() {
        ticketDB = mock(TicketDB.class);
        ticket = new Ticket(new Movie("Pulp Fiction", "Desc"), new Date(2020,13,01), (float) 14.99);
        cinema = new Cinema(ticketDB);
        Customer customer = new Customer(new LoginDetails("jakubfaldasz", "passw0rd", "jakubfaldasz@gmail.com"), new Date(1997, 5,13));
        cinema.setUser(customer);
    }

    @After
    public void cleanUp() {
        cinema.setTicketDB(null);
    }

    @Test
    public void shouldAddTicketToUserAccount() {
        assertTrue(cinema.addTicketToUserAccount(ticket));
    }

    @Test
    public void shouldntAddTicketToUserAccount() {
        assertFalse(cinema.addTicketToUserAccount(null));
    }

}