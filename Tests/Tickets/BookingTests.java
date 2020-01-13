package Tests.Tickets;

import Application.DataAccess.*;
import Application.Movie;
import Application.Ticket;
import Application.Tickets.Booking;
import Application.Users.*;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.Time;
import java.util.Date;

public class BookingTests {
    private TicketDB ticketDB;
    private Booking booking;
    private Customer customer;
    private Movie movie;
    private Date screeningDate;
    private Time time;

    @Before
    public void setUp() {
        ticketDB = mock(TicketDB.class);
        booking = new Booking(ticketDB);
        customer = new Customer(new LoginDetails("user",
                "pass", "email@gmail.com"),
                new Date(1997,05,13));
        movie = new Movie("Pulp Fiction", "desc");
        screeningDate = new Date(2020,02,01);
        time = new Time(20,00,00);

    }

    @After
    public void cleanUp() {
        booking.setTicketDB(null);
    }

    @Test
    public void shouldBookTicketProperly() {
        Ticket bookedTicket = new Ticket(movie, screeningDate, movie.getPrice());
        assertEquals(bookedTicket, booking.bookTicket(customer, movie, screeningDate, time));
    }

//    @Test
//    public void shouldntAddTicketToUserAccount() {
//        assertFalse(cinema.addTicketToUserAccount(null));
//    }

}