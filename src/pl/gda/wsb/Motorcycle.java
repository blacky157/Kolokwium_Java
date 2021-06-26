package pl.gda.wsb;

public class Motorcycle extends Vehicle {
    String type;

    public Motorcycle(String registration, String vinNumber, String kolor, Double prize, Double fuelConsumption, Double fuelTank, Double mileage, String type) {
        super(registration, vinNumber, kolor, prize, fuelConsumption, fuelTank, mileage);
        this.type = type;
    }

    @Override
    public void drive(Double kilometers) {
        if (checkToDrive() < kilometers) {
            System.out.println("brakuje wachy");
        } else {
            this.mileage = this.mileage + kilometers;
            this.fuelTank = this.fuelTank - (kilometers / 100) * this.fuelConsumption;
            System.out.println("Motór pojechał");
            System.out.println("Pozostało Ci " + this.fuelTank + "l");
            System.out.println("na licznku masz teraz " + this.mileage);
        }

    }


    @Override
    public void refuel(double liters) {
        this.fuelTank = this.fuelTank + liters;
        System.out.println("pojazd zatankowany, masz teraz " + this.fuelTank);
    }


    @Override
    public Double checkToDrive() {
        Double a;
        a = (this.fuelTank / this.fuelConsumption) * 100;
        System.out.println("Motor na zbiorniku przejedzie " + a);
        return a;
    }
}
