package services;

import entities.Event;
import interfaces.IEventManagement;
import java.util.ArrayList;

import java.util.List;

public  class EventManager implements IEventManagement { //A IEventManagement é a interface da EventManager 
   
    private List<Event> events; //Pode ser colocado final pois não está sendo "utilizado nessa classe em especifico"

    public EventManager() {
        this.events = new ArrayList<>();
    }

    @Override
    public void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added: " + event.getEventName());
    }

    @Override
    public void removeEvent(Event event) {
        events.remove(event);
        System.out.println("Event removed: " + event.getEventName());
    }

    @Override
    public void listEvent() {
        System.out.println("Listing all events:");
        for (Event event : events) {
            System.out.println(event);
        }
    }
}


