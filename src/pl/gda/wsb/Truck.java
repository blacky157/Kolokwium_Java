package pl.gda.wsb;

public class Truck extends Vehicle {
    String capacity;

    public Truck(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, String capacity) {
        super(registration, vinNumber, kolor, prize, fuelConsumption, fuelTank, mileage);
        this.capacity = capacity;
    }

    @Override
    public void drive(Double kilometers) {
        if (checkToDrive() < kilometers) {
            System.out.println("brakuje wachy");
        } else {
            this.mileage = this.mileage + kilometers;
            this.fuelTank = this.fuelTank - (kilometers / 100) * this.fuelConsumption;
            System.out.println("ciężarówa pojechała");
            System.out.println("Pozostało Ci " + this.fuelTank + "l");
            System.out.println("na licznku masz teraz " + this.mileage);
        }

    }

    @Override
    public void refuel(Vehicle target, double liters) {
        System.out.println("cieżarówka zatankowana");
    }

    @Override
    public Double checkToDrive() {
        Double a;
        a = (this.fuelTank / this.fuelConsumption) * 100;
        System.out.println("ciężarówka na zbiorniku przejedzie " + a);
        return a;
    }
}
