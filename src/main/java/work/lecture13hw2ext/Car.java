package work.lecture13hw2ext;

import lombok.Getter;

@Getter
public class Car extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }
}
