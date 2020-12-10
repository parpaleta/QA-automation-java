package work.lecture13hw2ext;

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
          Vehicle bus;

          car = setVehicle(reader.readLine().split("\\s+"));
          truck = setVehicle(reader.readLine().split("\\s+"));
          bus = setVehicle(reader.readLine().split("\\s+"));

          Map<String, Vehicle> vehicle = new LinkedHashMap<>();
          vehicle.put("Car", car);
          vehicle.put("Truck", truck);
          vehicle.put("Bus", bus);

          int commandsNumber = Integer.parseInt(reader.readLine());

          while (commandsNumber-- > 0){
              String[] tokens = reader.readLine().split("\\s+");

              if(tokens[0].equals("Drive")){
                  if (bus instanceof Bus){
                      ((Bus) bus).increaseConsumption();
                  }
                  vehicle.get(tokens[1]).drive(Integer.parseInt(tokens[2]));
              }
              if(tokens[0].equals("Refuel")){
                  vehicle.get(tokens[1]).refuel(Integer.parseInt(tokens[2]));
              }
              if(tokens[0].equals("DriveEmpty")){
                  vehicle.get(tokens[1]).drive(Integer.parseInt(tokens[2]));
              }
              if(commandsNumber<= 0){
                  break;
              }
          }
//        vehicle.values().forEach(System.out::println);
          vehicle.forEach((k,v) -> System.out.println(v.toString()));
    }

    public static Vehicle setVehicle(String[] data){
        Vehicle vehicle = null;

        if(data[0].equals("Car")){
            vehicle = new Car(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]));
        }
        if(data[0].equals("Truck")){
            vehicle = new Truck(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]));
        }
        if(data[0].equals("Bus")){
            vehicle = new Bus(Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]));
        }
        return vehicle;
    }
}
