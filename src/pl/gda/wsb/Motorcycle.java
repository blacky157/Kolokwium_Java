package pl.gda.wsb;

public class Motorcycle extends Vehicle {
    String type;

    public Motorcycle(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, String type) {
        super(registration, vinNumber, kolor, prize, fuelConsumption, fuelTank, mileage);
        this.type = type;
    }
}
