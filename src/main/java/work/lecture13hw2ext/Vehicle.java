package work.lecture13hw2ext;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Slf4j
public class Vehicle {
    private double fuelQuantity;
    @Setter
    private double fuelConsumption;
    private double tankCapacity;

    protected void drive (double distance){
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

    protected void refuel (double fuelQuantity){
        if(fuelQuantity <= 0){
            fuelQuantity = 0;
            log.error("Fuel must be a positive number");
//            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if(this.fuelQuantity + fuelQuantity > this.tankCapacity){
            fuelQuantity = 0;
            log.error("Cannot fit in tank");
//            throw new IllegalArgumentException("Cannot fit in tank");
        }
        this.fuelQuantity += fuelQuantity;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }

}
