package pl.gda.wsb;

public abstract class Vehicle {
    String registration;
    String vinNumber;
    String Kolor;
    Double Prize;
    Double fuelConsumption;
    Double fuelTank;
    Double mileage;

    public Vehicle(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage) {
        this.registration = registration;
        this.vinNumber = vinNumber;
        Kolor = kolor;
        Prize = prize;
        this.fuelConsumption = fuelConsumption;
        this.fuelTank = fuelTank;
        this.mileage = mileage;
    }


}
