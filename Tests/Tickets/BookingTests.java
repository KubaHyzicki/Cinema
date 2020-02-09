package Tests.Tickets;

import Application.Cinema;
import Application.DataAccess.*;
import Application.Movie;
import Application.Ticket;
import Application.Tickets.Booking;
import Application.Users.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class BookingTests {
    @Mock
    Booking booking;
    TicketDB ticketDB;
    Customer customer;
    Time time;

    @Before
    public void setUp() {
        ticketDB = mock(TicketDB.class);
        booking = new Booking( mock(TicketDB.class));
        customer = mock(Customer.class);
        time = mock(Time.class);
    }

    @Test
    public void bookTicketReturnsTicketWhenProperlyCalled() throws SQLException {
        Movie movie = new Movie("Pocahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
        movie.setPrice((int) 66.6);
        Date date = new Date(1234,12,22);
        Ticket ticket = new Ticket(movie, date, movie.getPrice());
        doNothing().when(ticketDB).addTicket(any());
        assertEquals(ticket, booking.bookTicket(customer, movie, date, time));
    }

    @Test
    public void bookTicketCheckIfTicketIsNotInitiallyPaid() throws SQLException {
        Movie movie = new Movie("Pocahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
        movie.setPrice((float) 66.6);
        Date date = new Date(1234,12,22);
        doNothing().when(ticketDB).addTicket(any());
        assertFalse(booking.bookTicket(customer, movie, date, time).getWasPaid());
    }

    @Test(expected = NullPointerException.class)
    public void bookTicketThrowNullPointerExceptionIfMovieIsNull() throws SQLException {
        Movie movie = null;
        Date date = new Date(1234,12,22);
        verify(booking.bookTicket(customer, movie, date, time));
    }

}