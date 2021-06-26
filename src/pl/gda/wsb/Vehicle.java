package pl.gda.wsb;

public abstract class Vehicle implements Actions {
    String registration;
    String vinNumber;
    String color;
    Double prize;
    Double fuelConsumption;
    Double fuelTank;
    Double mileage;
    Double maxFuel;

    public Vehicle(String registration, String vinNumber, String color, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, Double maxFuel) {
        this.registration = registration;
        this.vinNumber = vinNumber;
        this.color = color;
        this.prize = prize;
        this.fuelConsumption = fuelConsumption;
        this.fuelTank = fuelTank;
        this.mileage = mileage;
        this.maxFuel = maxFuel;
    }


}
