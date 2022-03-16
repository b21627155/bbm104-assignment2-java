import CarDealer.CarDealer;
/**
 * in this class process data if type of vehicle is car
 */

public class Car extends CarDealer {
    /**
     * @param type type of vehicle
     * @param model model of car
     * @param age   age of car
     * @param price price of car
     * @param number_of_doors number of doors of car
     */
    private String type = new String();
    private String model = new String();
    private String age = new String();

    private String price = new String();
    private String number_of_doors =new String();

    /**
     *get type of vehicle
     * @return type of vehicle
     */

    public String getType(){
        return type ;
    }

    /**
     * set type of vehicle
     */

    public void setType(){
        type = Main.vehicle[0];
    }

    /**
     *get age of car
     * @return age of car
     */
    public String getAge(){
        return age;
    }

    /**
     * set age of car
     */
    public void setAge(){
        age = Main.vehicle[1];
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

    /**
     *get model of car
     * @return model of car
     */
    public String getModel(){
        return model;
    }

    /**
     * set model of car
     */
    public void setModel(){
        model = Main.vehicle[2];
        if (model.length() > MAX_VEHICLE_NAME_SIZE){
            model = model.substring(0, MAX_VEHICLE_NAME_SIZE);
        }
        else{
            return;
        }
    }

    /**
     *get price of car
     * @return price of car
     */
    public  String getPrice(){
        return price;
    }

    /**
     * set price of car
     */
    public void setPrice(){
        price = Main.vehicle[3];
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

    /**
     * get number of doors of car
     * @return number of  doors of car
     */
    public String getNumber_of_doors(){
        return number_of_doors;
    }

    /**
     * set number of doors of car
     */
    public void setNumber_of_doors(){
        number_of_doors = Main.vehicle[4];
    }

}
