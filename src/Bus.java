import CarDealer.CarDealer;
import java.io.FileWriter;
import java.util.Locale;

/**
 * in this class process data if type of vehicle is bus
 */

public class Bus extends CarDealer {
    /**
     * @param type type of vehicle
     * @param model model of bus
     * @param age   age of bus
     * @param capacity capacity of bus
     * @param price price of bus
     * @param tax_rate taxe rate of bus
     */

    private String type;
    private String model;
    private String age;
    private String capacity;
    private String price;
    private String tax_rate;

    /**
     *Add the information belonging to the bus to the sold_vehicle arrayList
     * @param out
     */

    public void bus(FileWriter out){

        type = Main.vehicle[0];
        age = Main.vehicle[1];
        model = Main.vehicle[2];
        price = Main.vehicle[3];
        tax_rate = Main.vehicle[4];
        capacity = Main.vehicle[5];

        if(Integer.parseInt(age) < MIN_VEHICLE_AGE || Integer.parseInt(age) > MAX_VEHICLE_AGE ){
            if (Integer.parseInt(age) < MIN_VEHICLE_AGE){
                age = String.valueOf(MIN_VEHICLE_AGE);
            }
            else if (Integer.parseInt(age) > MAX_VEHICLE_AGE){
                age = String.valueOf(MAX_VEHICLE_AGE);
            }
            else{
                age = age;
            }
        }
        else if(Integer.parseInt(capacity) < MIN_BUS_CAPACITY || Integer.parseInt(capacity) > MAX_BUS_CAPACITY){
            if (Float.parseFloat(capacity) < MIN_BUS_CAPACITY) {
                capacity = String.valueOf(MIN_BUS_CAPACITY);
            }
            else if (Float.parseFloat(capacity) > MAX_BUS_CAPACITY){
                capacity = String.valueOf(MAX_BUS_CAPACITY);
            }
            else{
                capacity = capacity;
            }
        }
        else if(Float.parseFloat(price) < MIN_VEHICLE_PRICE || Float.parseFloat(price) > MIN_VEHICLE_PRICE){
            if (Float.parseFloat(price) < MIN_VEHICLE_PRICE){
                price = String.valueOf(MIN_VEHICLE_PRICE);
            }
            else if (Float.parseFloat(price) > MAX_VEHICLE_PRICE){
                price = String.valueOf(MAX_VEHICLE_PRICE);
            }
            else{
                price = price;
            }
        }
        if (model.length() > MAX_VEHICLE_NAME_SIZE){
            model = model.substring(0,MAX_VEHICLE_NAME_SIZE);
        }

        price = String.valueOf(Float.parseFloat(price)*Float.parseFloat(tax_rate)/100+Float.parseFloat(price));
        Main.sold_vehicle.add("\nType : " + type);
        Main.sold_vehicle.add("Model : " + model);
        Main.sold_vehicle.add("Age : " + age);
        Main.sold_vehicle.add("Capacity : " + capacity);
        Main.sold_vehicle.add("Price : " + String.format(Locale.US, "%.2f", Float.parseFloat(price)));
        Main.totalMoney += Float.parseFloat(price);

    }

}
