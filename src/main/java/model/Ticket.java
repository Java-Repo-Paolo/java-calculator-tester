package model;

public class Ticket {

    //ATTRIBUTI
    private double travelKm;
    private double agePerson;
    private final double PRICE_FOR_KM = 0.21;
    private final double DISCOUNT_UNDER_18 = 0.20;
    // sconto per gli over 65
    private final double DISCOUNT_OVER_65 = 0.40;

    //COSTRUTTORE
    public Ticket( double travelKm, double PRICE_FOR_KM, double agePerson) {
        if (travelKm <= 0){
            throw new IllegalArgumentException("Km must be > 0");
        }
        if (agePerson <= 0){
            throw new IllegalArgumentException("The person's must be > 0");
        }
        this.travelKm = travelKm;
        this.agePerson = agePerson;
    }

    //METODI
    public double getTravelKm() {
        return travelKm;
    }

    public double getPriceForKm() {
        return PRICE_FOR_KM;
    }

    public double getAgePerson() {
        return agePerson;
    }

    public void setTravelKm(double travelKm) {
        this.travelKm = travelKm;
    }

    public void setAgePerson(double agePerson) {
        this.agePerson = agePerson;
    }


    public double calculatePrice(double resultPrice){
        if (agePerson < 18){
            //Se l'età è minore di 18 anni allora:
            resultPrice = (travelKm * PRICE_FOR_KM) * DISCOUNT_UNDER_18;
        } else if(agePerson > 65) {
            //Se l'età è maggiore di 65 anni allora:
            resultPrice =  (travelKm * PRICE_FOR_KM) * DISCOUNT_OVER_65;
        }else {
            resultPrice = travelKm * PRICE_FOR_KM;
        }
        return resultPrice;
    }

}
