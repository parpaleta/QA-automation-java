package work.lecture13hw2;

import lombok.Getter;

@Getter
public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refuel(double fuelQuantity){
        super.refuel(fuelQuantity * 0.95);
    }
}
