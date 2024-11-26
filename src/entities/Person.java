

package entities;

public abstract class Person {
  
    private String name;
    private String contatoInfo;
    
    public Person(String name, String contatoInfo) {
        this.name = name;
        this.contatoInfo = contatoInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContatoInfo() {
        return contatoInfo;
    }

    public void setContatoInfo(String contatoInfo) {
        this.contatoInfo = contatoInfo;
    }

    @Override //Estamos usando para garantir que estamos sobrescrevendo o método e não criando outro
    public String toString() {
        return "Name: " + name + ", Contato Info: " + contatoInfo;
    }
}


