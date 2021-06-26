package pl.gda.wsb;

public interface Actions {
    void drive(Double kilometers);

    void refuel(double liters);

    Double checkToDrive();

    void changeColor(String newColor);
}
