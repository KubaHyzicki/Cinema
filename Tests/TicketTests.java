package Tests;

import Application.Movie;
import Application.Ticket;
import org.junit.*;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TicketTests{

    @Before
    public void setUp(){
        Movie movie = new Movie("Pocahontas",
                "Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął..."
        );
    }

    @Test
    public void NotEqualsReturnsTrue(Movie movie){
        Movie movie2 = new Movie("Pocahontas",
                "Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął..."
        );
        Ticket ticket1 = new Ticket(movie,
                new Date(1212,03,28),
                (float)12.41);
        Ticket ticket2 = new Ticket(movie2,
                new Date(1212,03,28),
                (float)12.41);
        assertEquals(ticket1.equals(ticket2),true);
    }

    @Test
    public void NotEqualsReturnsFalse(Movie movie){
        Movie movie2 = new Movie("Pocahontas2",
                "Czy wiesz czemu wilk tak wyje w księżycooową noc? Bo było ciemno i się w mały palec walnąąął..."
        );
        Ticket ticket1 = new Ticket(movie,
                new Date(1212,03,28),
                (float)12.41);
        Ticket ticket2 = new Ticket(movie2,
                new Date(1212,03,28),
                (float)12.41);
        assertEquals(ticket1.equals(ticket2),false);
    }
};