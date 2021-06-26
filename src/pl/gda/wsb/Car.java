package pl.gda.wsb;

public class Car extends Vehicle {
    Integer doors;

    public Car(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, Integer doors) {

        super(registration, vinNumber, kolor, prize, fuelConsumption, fuelTank, mileage);
        this.doors = doors;

    }
}
