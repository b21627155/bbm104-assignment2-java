import CarDealer.CarDealer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
/**
 * in this class process data if type of vehicle is truck
 */
public class Truck extends CarDealer {
    /**
     * @param type type of vehicle
     * @param model model of truck
     * @param age   age of truck
     * @param tonnage capacity of truck
     * @param price price of truck
     * @param tax_rate taxe rate of truck
     */

    private String type;
    private String model;
    private String age;
    private String tonnage;
    private String price;
    private String tax_rate;

    /**
     * Add the information belonging to the truck to the sold_vehicle arrayList
     * @param out
     * @throws IOException
     */


    public void truck(FileWriter out) throws IOException {

        type = Main.vehicle[0];
        age = Main.vehicle[1];
        model = Main.vehicle[2];
        price = Main.vehicle[3];
        tax_rate = Main.vehicle[4];
        tonnage = Main.vehicle[5];

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
        else if(Integer.parseInt(tonnage) < MIN_TRUCK_TONNAGE || Integer.parseInt(tonnage) > MAX_TRUCK_TONNAGE){
            if (Integer.parseInt(tonnage) < MIN_TRUCK_TONNAGE){
                tonnage = String.valueOf(MIN_TRUCK_TONNAGE);
            }
            else if (Integer.parseInt(tonnage) > MAX_TRUCK_TONNAGE){
                tonnage = String.valueOf(MAX_TRUCK_TONNAGE);
            }
            else{
                tonnage = tonnage;
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
        Main.sold_vehicle.add("Tonnage : " + tonnage);
        Main.sold_vehicle.add("Price : " + String.format(Locale.US, "%.2f", Float.parseFloat(price)));
        Main.totalMoney += Float.parseFloat(price);

    }

}
