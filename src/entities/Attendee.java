package entities;

public class Attendee extends Person{
   
 private String id;

    public Attendee (String name, String contatoInfo, String id){
        super(name, contatoInfo);
        this.id = id;
    }
public String getId(){
    return id;
}

public void setId(String id){
    this.id = id;
}
 @Override
 public String toString(){
    return "Attendee [ID: " + id + ", Name: " + getName() + ", Contato: " + getContatoInfo() + "]";
    
 }
}