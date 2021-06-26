package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GLEPA56", "123d", "czerwony", 2000.0, 5.0,50.0,2500000.0,60.0,5);
        car1.checkToDrive();
        car1.drive(500.0);
        car1.refuel(60);

    }
}
