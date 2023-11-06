package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TicketTest {
    @Test
    @DisplayName("Calculate Ticket Normal")
    void testCalculatePrice() {
        Ticket ticket = new Ticket(150, 0.21, 25);
        double calculatedPrice = ticket.calculatePrice(0);
        System.out.println(calculatedPrice);

        // Verifica il calcolo del prezzo
        assertEquals(31.5, calculatedPrice);
    }

    @Test
    @DisplayName("Calculate Ticket Under18")
    void testCalculatePriceUnder18() {
        Ticket ticket = new Ticket(120, 0.21, 17);
        double calculatedPrice = ticket.calculatePrice(0);
        System.out.println(calculatedPrice);

        // Verifica il calcolo del prezzo
        assertEquals(5.04, calculatedPrice);
    }

    @Test
    @DisplayName("Calculate Ticket Over65")
    void testCalculatePriceOver65() {
        Ticket ticket = new Ticket(120, 0.21, 66);
        double calculatedPrice = ticket.calculatePrice(0);
        System.out.println(calculatedPrice);

        // Verifica il calcolo del prezzo
        assertEquals(10.08, calculatedPrice);
    }

}
