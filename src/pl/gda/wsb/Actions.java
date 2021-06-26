package pl.gda.wsb;

public interface Actions {
    void drive(Double kilometers) ;
    void refuel(Vehicle  target, double liters);
    Double checkToDrive();
}
