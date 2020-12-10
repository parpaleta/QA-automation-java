package work.lecture13hw2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Slf4j
public class Vehicle implements VehicleActions{
    private double fuelQuantity;
    private double fuelConsumption;

    public void drive (double distance){
        double currentQuantity = getFuelQuantity();
        double fuelConsumption = getFuelConsumption();

        double possibleDistance = getFuelQuantity() / getFuelConsumption();
        if(possibleDistance < distance){
            log.info("{} needs refueling", getClass().getSimpleName());
        }else{
            currentQuantity -= distance * fuelConsumption;
            this.fuelQuantity = currentQuantity;
            log.info("{} traveled {} km", getClass().getSimpleName() , String.format("%.2f", distance) );
        }
    }

    public void refuel (double fuelQuantity){
        this.fuelQuantity += fuelQuantity;
        log.info("{}: {}", getClass().getSimpleName() , String.format("%.2f", this.fuelQuantity ));
    }

}
