package pl.gda.wsb;

public class Truck extends Vehicle  {
    String capacity;

    public Truck(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, String capacity) {
        super(registration, vinNumber, kolor, prize, fuelConsumption, fuelTank, mileage);
        this.capacity = capacity;
    }

    @Override
    public void drive(Vehicle target) {
        System.out.println("cięzarówa pojechała");
    }

    @Override
    public void refuel(Vehicle target, double liters) {
        System.out.println("cieżarówka zatankowana");
    }
}
