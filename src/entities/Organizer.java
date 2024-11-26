package entities;

public class Organizer extends Person{ 
   
    private String organizerId;

    public Organizer(String name, String contatoInfo, String organizerId) {
        super(name, contatoInfo);
        this.organizerId = organizerId;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public void createEvent() {
        System.out.println("Event created by organizer: " + getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", Organizer ID: " + organizerId;
    }
}
