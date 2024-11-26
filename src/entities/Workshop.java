package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Workshop extends Event {
  
     private String topic;

    // Construtor
    public Workshop(String eventName, LocalDate date, LocalTime time, String topic) {
        super(eventName, date, time);
        this.topic = topic;
    }

  
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    @Override
    public void displayEventDetails() {
        System.out.println("Workshop [Topic: " + topic + ", Event " + super.toString() + "]");
    }
}