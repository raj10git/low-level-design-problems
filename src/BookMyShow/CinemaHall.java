package BookMyShow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
    Audi audi;
    Address address;
    Show show;

    public CinemaHall(Audi audi, Address address, Show show){
        this.audi = audi;
        this.address = address;
        this.show = show;
    }

    public List<Show> getShows(audi){
        return new ArrayList<>();
    }
}
