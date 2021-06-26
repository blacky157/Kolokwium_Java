package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GLEPA56", "ssad", "czerwony", 50000.0, 6.0, 50.0, 250000.0, 60.0, 5);
        Car car2 = new Car("GA32JK", "12312321njk", "zielony", 24567.0, 3.5, 45.5, 12000.3, 50.0, 3);
        car1.checkToDrive();
        car1.drive(500.0);
        car1.refuel(60);
        car1.changeColor("biały");

        car2.checkToDrive();
        car2.drive(300.0);
        car2.refuel(40);
        car2.changeColor("biały");

        Motorcycle motorcycle1 = new Motorcycle("GDOT55", "sdasdas123", "niebieski", 12000.3, 3.0, 25.0, 10000.5, 25.0, "cruser");
        Motorcycle motorcycle2 = new Motorcycle("GDAT55", "sddsasdas123", "niebieski", 15600.3, 3.0, 25.0, 10000.5, 25.0, "cruser");

        motorcycle1.checkToDrive();
        motorcycle1.drive(50.0);
        motorcycle1.refuel(10);
        motorcycle1.changeColor("biały");

        motorcycle2.checkToDrive();
        motorcycle2.drive(100.0);
        motorcycle2.refuel(20);
        motorcycle2.changeColor("biały");

        Truck truck1 = new Truck("WWASD22", "2S138131", "czarny", 100000.0, 15.0, 90.0, 5000000.5, 500.5, "20T");
        Truck truck2 = new Truck("GWESD22", "dasdc2", "czarny", 150000.0, 12.0, 190.0, 200000.5, 550.5, "30T");

        truck1.checkToDrive();
        truck1.drive(5000.0);
        truck1.refuel(100);
        truck1.changeColor("czerwony");

        truck2.checkToDrive();
        truck2.drive(500.0);
        truck2.refuel(150);
        truck2.changeColor("zielony");

    }
}
