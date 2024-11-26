package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event{

    private String bandName;

    public Concert(String eventName, LocalDate date, LocalTime time, String bandName) {
        super(eventName, date, time);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Concert Details: " + toString() + ", Band Name: " + bandName);
    }
}

