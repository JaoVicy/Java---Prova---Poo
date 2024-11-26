package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Event {
    
    private String eventName;
    private LocalDate date;
    private LocalTime time;

    // Construtor
    public Event(String eventName, LocalDate date, LocalTime time) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
    }

    // Getters e Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "[Name: " + eventName + ", Date: " + date + ", Time: " + time + "]";
    }

    // Método abstrato
    public abstract void displayEventDetails();
}