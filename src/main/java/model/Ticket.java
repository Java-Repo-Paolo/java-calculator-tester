package model;

public class Ticket {

    //ATTRIBUTI
    private double travelKm;
    private double agePerson;
    private double priceForKm = 0.21;
    private double discountunder18 = 0.20;
    // sconto per gli over 65
    private double discountover65 = 0.40;

    //COSTRUTTORE
    public Ticket( double travelKm, double priceForKm, double agePerson) {
        this.travelKm = travelKm;
        this.agePerson = agePerson;
    }

    //METODI
    public double getTravelKm() {
        return travelKm;
    }

    public double getPriceForKm() {
        return priceForKm;
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
            resultPrice = (travelKm * priceForKm) * discountunder18;
        } else if(agePerson > 65) {
            //Se l'età è maggiore di 65 anni allora:
            resultPrice =  (travelKm * priceForKm) * discountover65;
        }else {
            resultPrice = travelKm * priceForKm;
        }
        return resultPrice;
    }

}
