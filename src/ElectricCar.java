import java.util.Locale;
/**
 * in this class process data if type of vehicle is electric car
 */
public class ElectricCar extends Car{
    /**
     * @param battery_capacity battery capacity of electic car
     */
    private String battery_capacity = new String();

    /**
     *Add the information belonging to the electric car to the sold_vehicle arrayList
     */
    public void electricCar(){
        setType();
        setModel();
        setAge();
        setNumber_of_doors();
        setPrice();
        battery_capacity = Main.vehicle[5];
        if(Integer.parseInt(battery_capacity) < MIN_BATTERY_TONNAGE || Integer.parseInt(battery_capacity) > MAX_BATTERY_TONNAGE ){
            if (Integer.parseInt(battery_capacity) < MIN_BATTERY_TONNAGE){
                battery_capacity = String.valueOf(MIN_BATTERY_TONNAGE);
            }
            else if (Integer.parseInt(battery_capacity) > MAX_BATTERY_TONNAGE){
                battery_capacity = String.valueOf(MAX_BATTERY_TONNAGE);
            }
            else{
                battery_capacity = battery_capacity;
            }
        }

        Main.sold_vehicle.add("\nType : " + getType() + " Car");
        Main.sold_vehicle.add("Model : " + getModel());
        Main.sold_vehicle.add("Age : " + getAge());
        Main.sold_vehicle.add("Battery Capacity : " + battery_capacity);
        Main.sold_vehicle.add("Number of Doors : " + getNumber_of_doors());
        Main.sold_vehicle.add("Price : " + String.format(Locale.US, "%.2f", Float.parseFloat(getPrice())));
        Main.totalMoney += Float.parseFloat(getPrice());
    }
}
