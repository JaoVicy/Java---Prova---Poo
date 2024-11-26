package entities;

public class Venue {
  
    private String venueName;
    private String address;
    private String capacity;

    public Venue(String venueName, String address, String capacity) {
        this.venueName = venueName; 
        this.address = address;
        this.capacity = capacity;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue Name: " + venueName + ", Address: " + address + ", Capacity: " + capacity;
    }
}
    
            
