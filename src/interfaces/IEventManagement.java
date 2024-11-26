package interfaces;

import entities.Event;

public interface  IEventManagement{
  
    public void addEvent(Event event);
    public void removeEvent(Event event);
    public void listEvent();
}

