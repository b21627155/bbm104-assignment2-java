import java.util.Locale;/**
 * in this class process data if type of vehicle is petrol car
 */
public class PetrolCar extends Car{
    /**
     * @param fuel_capacity fuel capacity of petrol car
     */
    private String fuel_capacity = new String();

    /**
     * Add the information belonging to the petrol car to the sold_vehicle arrayList
     */

    public void petrolCar(){
        setType();
        setModel();
        setAge();
        setNumber_of_doors();
        setPrice();
        fuel_capacity = Main.vehicle[5];
        if(Integer.parseInt(fuel_capacity) < MIN_FUEL_CAPACITY || Integer.parseInt(fuel_capacity) > MAX_FUEL_CAPACITY ){
            if (Integer.parseInt(fuel_capacity) < MIN_FUEL_CAPACITY){
                fuel_capacity = String.valueOf(MIN_FUEL_CAPACITY);
            }
            else if (Integer.parseInt(fuel_capacity) > MAX_FUEL_CAPACITY){
                fuel_capacity = String.valueOf(MAX_FUEL_CAPACITY);
            }
            else{
                fuel_capacity = fuel_capacity;
            }
        }


        Main.sold_vehicle.add("\nType : " + getType() + " Car");
        Main.sold_vehicle.add("Model : " + getModel());
        Main.sold_vehicle.add("Age : " + getAge());
        Main.sold_vehicle.add("Fuel Capacity : " + fuel_capacity);
        Main.sold_vehicle.add("Number of Doors : " + getNumber_of_doors());
        Main.sold_vehicle.add("Price : " + String.format(Locale.US, "%.2f", Float.parseFloat(getPrice())));
        Main.totalMoney += Float.parseFloat(getPrice());
    }

}
