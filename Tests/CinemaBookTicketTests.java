package Tests;

import Application.Cinema;
import Application.DataAccess.TicketDB;
import Application.Movie;
import Application.Ticket;
import Application.Tickets.Booking;
import Application.Users.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.Time;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CinemaBookTicketTests {
    Ticket ticket;

    @Mock
    Cinema cinema;
    TicketDB ticketDB;
    Customer user;
    Movie movie;
    Date date;
    Time time;

    @Before
    public void setUp() {
        cinema = new Cinema( mock(TicketDB.class));
        ticketDB = mock(TicketDB.class);
        user = mock(Customer.class);
        movie = mock(Movie.class);
        date = mock(Date.class);
        time = mock(Time.class);
    }

    @Test
    public void bookTicketReturnsFalseWhenNotLoggedIn(){
        assertFalse(cinema.bookTicket(user, movie, date, time));
    }

//    @Test
//    public void bookTicketReturnsTrueWhenGeneratedTicketIsCorrect(){
//        Movie movie = new Movie("Pocahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
//        Date date = new Date(2020, 2, 10);
//        Time time = new Time(13, 13, 13);
//        cinema.setLoggedIn(true);
//        assertTrue(cinema.bookTicket(user, movie, date, time));
//    }
}