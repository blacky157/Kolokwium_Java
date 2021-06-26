package pl.gda.wsb;

public class Motorcycle extends Vehicle  {
    String type;

    public Motorcycle(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, String type) {
        super(registration, vinNumber, kolor, prize, fuelConsumption, fuelTank, mileage);
        this.type = type;
    }

    @Override
    public void drive(Vehicle target) {
        System.out.println("Motór pojechał");
    }

    @Override
    public void refuel(Vehicle target, double liters) {
        System.out.println("Motór zatankowany");
    }
}
