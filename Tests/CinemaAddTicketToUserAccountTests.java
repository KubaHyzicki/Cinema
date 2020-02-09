package Tests;

import Application.Cinema;
import Application.DataAccess.*;
import Application.Movie;
import Application.Ticket;
import Application.Tickets.*;
import Application.Users.*;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class CinemaAddTicketToUserAccountTests {
    Ticket ticket;

    @Mock
    Cinema cinema;
    TicketDB ticketDB;
    Customer user;

    @Before
    public void setUp() {
        cinema = new Cinema( mock(TicketDB.class));
        ticketDB = mock(TicketDB.class);
        user = mock(Customer.class);
        Movie movie = new Movie("Pocahontas","Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął...");
        ticket = new Ticket(movie,new Date(1992,12,12), (float) 12.12);
    }

    @Test
    public void addTicketToUserAccountReturnsTrueWhenArgIsCorrect() throws SQLException {
        doNothing().when(ticketDB).addTicketToUser(ticket, user);
        doNothing().when(user).addTicket(ticket);
        cinema.setUser(user);
        assertTrue(cinema.addTicketToUserAccount(ticket));
    }

    @Test
    public void addTicketToUserAccountReturnsFalseWhenArgIsNull() {
        Ticket ticketNull = null;
        assertFalse(cinema.addTicketToUserAccount(ticketNull));
    }

//    @Test
//    public void addTicketToUserAccountReturnsFalseIfSQLException() throws SQLException {
//        ticketDB = mock(TicketDB.class);
//        doThrow(new SQLException("expected error")).when(ticketDB).addTicketToUser(ticket, user);
////        doThrow(new SQLException("expected error")).when(ticketDB).addTicketToUser(any(), any());
////        doThrow(SQLException.class).when(ticketDB).addTicketToUser(any(), any());
//        cinema.setUser(user);
//        assertFalse(cinema.addTicketToUserAccount(ticket));
//    }
}