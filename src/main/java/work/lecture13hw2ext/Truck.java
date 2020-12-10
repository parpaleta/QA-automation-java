package work.lecture13hw2ext;

import lombok.Getter;

@Getter
public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.6;
    private static final double FUEL_LOSS = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double fuelQuantity){
        super.refuel(fuelQuantity * FUEL_LOSS);
    }
}
