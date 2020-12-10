package work.lecture13hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          Vehicle car;
          Vehicle truck;

          car = setVehicle(reader.readLine().split("\\s+"));
          truck = setVehicle(reader.readLine().split("\\s+"));

          Map<String, Vehicle> vehicle = new LinkedHashMap<>();
          vehicle.put("Car", car);
          vehicle.put("Truck", truck);

          int commandsNumber = Integer.parseInt(reader.readLine());

          while (commandsNumber-- > 0){
              String[] tokens = reader.readLine().split("\\s+");

              if(tokens[0].equals("Drive")){
                  vehicle.get(tokens[1]).drive(Integer.parseInt(tokens[2]));
              }
              if(tokens[0].equals("Refuel")){
                  vehicle.get(tokens[1]).refuel(Integer.parseInt(tokens[2]));
              }
              if(commandsNumber<= 0){
                  break;
              }
          }
    }

    public static Vehicle setVehicle(String[] data){
        Vehicle vehicle = null;

        if(data[0].equals("Car")){
            vehicle = new Car (Double.parseDouble(data[1]), Double.parseDouble(data[2]));
        }
        if(data[0].equals("Truck")){
            vehicle = new Truck(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
        }
        return vehicle;
    }
}
