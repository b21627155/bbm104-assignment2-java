import CarDealer.CarDealer;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
/**
 *  Second Hand Car Dealer program that sells vehicles such as car, truck and bus.
 *  @author Mustafa Çoban
 *  @version 1.0
 *  @since 2021-08-13
 */

public class Main {
    /**
     * @param vehicle read line by line and assign variable in input file
     * @param sold_vehicle store vehicle tha are sold
     * @param totalManey calculate and store total money
     */

    static String[] vehicle = new String[6];
    static ArrayList<String> sold_vehicle = new ArrayList<String>();
    static double totalMoney;

    /**
     * Read input file and write processed data to output file
     * @param args assign the value given in commands line
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        /**
         * @param output write data to output file
         * @param input_file read input file
         * @param counter number of vehicles are sold
         */
        FileWriter output = new FileWriter(args[1]);

        Scanner input_file = new Scanner(new File(args[0]));

        int counter = 0;
        while (input_file.hasNextLine()){

            vehicle = input_file.nextLine().split(" ");
            if(vehicle[0].equals("Petrol")){
                if (counter == CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD)
                    continue;
                PetrolCar petrolcarr = new PetrolCar();
                petrolcarr.petrolCar();
                counter++;

            }
            else if(vehicle[0].equals("Electric")){
                if (counter == CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD)
                    continue;
                ElectricCar electriccar = new ElectricCar();
                electriccar.electricCar();
                counter++;

            }
            else if(vehicle[0].equals("Bus")){
                if (counter == CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD)
                    continue;
                Bus bus1 = new Bus();
                bus1.bus(output);
                counter++;


            }
            else if(vehicle[0].equals("Truck")){
                if (counter == CarDealer.MAX_NUMBER_OF_VEHICLE_THAT_CAN_BE_SOLD)
                    continue;
                Truck truck1 = new Truck();
                truck1.truck(output);
                counter++;

            }
            else if(vehicle[0].equals("print")){
                output.write("Number of Vehicles that are sold: " + counter + "\n");
                if(totalMoney == 0){
                    output.write("\nNo Vehicle that is sold\n");
                }

                writer(output);
                counter = 0;

            }
        }


        output.close();
    }

    /**
     * The writer method prints the properties of the vehicles sold and the total money to the output file.Then clears the "sold_vehicle" arrayList and makes "totalMoney" equal to zero
     * @param output
     * @throws Exception
     */

    static void writer(FileWriter output) throws Exception{
        int i=0;
        while (i<sold_vehicle.size()){
            output.write(sold_vehicle.get(i) + "\n");
            i++;

        }
        output.write("\nTotal Amount of Money : " + String.format(Locale.US, "%.2f",totalMoney) + "\n");
        sold_vehicle.clear();
        totalMoney = 0;
        output.write("\n");

    }
}
