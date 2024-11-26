package application;

import entities.Attendee;
import entities.Concert;
import entities.Event;
import entities.Organizer;
import entities.Venue;
import entities.Workshop;
import java.time.LocalDate;
import java.time.LocalTime;
import services.EventManager;

public class Main {

    public static void main(String[] args) {
        //----------------------------------------------------------------
        // Criando os locais (venues)
        //----------------------------------------------------------------
        Venue venue1 = new Venue("Unijuí - Prédio 8", "Unijuí", "200 pessoas");
        Venue venue2 = new Venue("Unijuí - Salão de Atos", "Unijuí", "500 pessoas");

        //----------------------------------------------------------------
        // Criando os participantes (attendees)
        //----------------------------------------------------------------
        Attendee attendee1 = new Attendee("Rodolfo Oliveira", "r.oliveria@gmail.com", "A001");
        Attendee attendee2 = new Attendee("Mariane Lima", "m.lima@outlook.com", "A002");

        //----------------------------------------------------------------
        // Criando os organizadores (organizers)
        //----------------------------------------------------------------
        Organizer organizer1 = new Organizer("Emilia da Silva", "e.silva@events.com", "O001");
        Organizer organizer2 = new Organizer("José Almeida", "j.almeida@events.com", "O002");

        //----------------------------------------------------------------
        // Criando eventos culturais Com as DATAS e HORAS!
        //----------------------------------------------------------------
        Event workshop = new Workshop(
                "Padrões de Projetos (em Java)",
                LocalDate.of(2024, 12, 1),
                LocalTime.of(20, 30),
                "Introdução aos padrões de projetos"
        );

        Event concert = new Concert(
                "Rock fest",
                LocalDate.of(2024, 12, 5),
                LocalTime.of(19, 10),
                "Pimenta & Seus Comparsas"
        );

        //----------------------------------------------------------------
        // Criando o gerenciador de eventos
        //----------------------------------------------------------------
        EventManager eventManager = new EventManager();

        //----------------------------------------------------------------
        // Adicionando eventos ao gerenciador
        //----------------------------------------------------------------
        eventManager.addEvent(workshop);
        eventManager.addEvent(concert);

        //----------------------------------------------------------------
        // Listando eventos
        //----------------------------------------------------------------
        System.out.println("--- Eventos Cadastrados ---");
        System.out.println("Event [Name: " + workshop.getEventName() + " , Date: " + workshop.getDate()
                + ", Time: " + workshop.getTime() + ", Venue: " + venue1.getVenueName() + "]");
        System.out.println("Event [Name: " + concert.getEventName() + ", Date: " + concert.getDate()
                + ", Time: " + concert.getTime() + ", Venue: " + venue2.getVenueName() + "]");

        //----------------------------------------------------------------
        // Exibindo detalhes individuais de eventos
        //----------------------------------------------------------------
        System.out.println("\n--- Detalhes dos Eventos ---");
        System.out.println("Concert [Band: " + ((Concert) concert).getBandName() + ", \n     Event " + concert + "]");
        System.out.println("Workshop [Topic: " + ((Workshop) workshop).getTopic() + ", \n     Event " + workshop + "]");
        //----------------------------------------------------------------
        // Exibindo participantes
        //----------------------------------------------------------------
        System.out.println("\n--- Participantes ---");
        System.out.println(attendee1);
        System.out.println(attendee2);
        //----------------------------------------------------------------
        // Exibindo organizadores
        //----------------------------------------------------------------
        System.out.println("\n--- Organizadores ---");
        System.out.println(organizer1);
        System.out.println(organizer2);

    }
}

