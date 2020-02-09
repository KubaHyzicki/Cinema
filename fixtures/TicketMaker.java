package fixtures;

import Application.Cinema;
import Application.DataAccess.TicketDB;
import Application.Movie;
import Application.Ticket;
import Application.Users.Customer;
import Application.Users.LoginDetails;
import Application.Users.User;
import fit.ColumnFixture;

import java.sql.Time;
import java.util.Date;

public class TicketMaker extends ColumnFixture {

    public String title;
    public String description;
    public int price;

    public void reset(){
        System.out.println("\nreset\n");
        title="";
        description="";
        price=0;
    }

    public void execute(){
        if(price > 0){
            SetUp.movie.setTitle(title);
            SetUp.movie.setDescription(description);
            SetUp.movie.setPrice(price);
            if(SetUp.cinema.bookTicket(SetUp.customer, SetUp.movie, SetUp.screeningDate, SetUp.time)){
                System.out.println("Succesfully booked ticket for:");
                System.out.println(SetUp.movie.getTitle()+"("+SetUp.movie.getDescription()+") which costs "+SetUp.movie.getPrice());
            }
        }
        else{
            System.out.println("Ujemna cena, print error");
        }
    }
}