package work.lecture13hw2ext;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public class Bus extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.4;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public void increaseConsumption(){
        this.setFuelConsumption(this.getFuelConsumption() + ADDITIONAL_CONSUMPTION);
    }


}
