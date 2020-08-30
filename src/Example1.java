public class Example1 {
    public static void main(String[] args){
        int var =5;
        double var2 = 5.60;

        aircraft cessna172 = new aircraft(); //creates Object of class aircraft

        aircraft piperSaratoga6 = new aircraft();

        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        System.out.println("Cessna 172 Passenger:" + cessna172.passengers);
        System.out.println("Cessna 172 Fuel Burn Rate:" + cessna172.fuelBurnRate +" gph");
        System.out.println("Cessna 172 Cruise Speed:" + cessna172.cruiseSpeed);
        System.out.println("Cessna 172 Fuel Capacity:" + cessna172.fuelCapacity);

        piperSaratoga6.passengers = 6;
        piperSaratoga6.cruiseSpeed = 201;
        piperSaratoga6.fuelCapacity =102.5;
        piperSaratoga6.fuelBurnRate =20.5;

        System.out.println("\nPiper Saratoga Cruise Speed:" + piperSaratoga6.cruiseSpeed +" mph");


        //aircraft pipperSaratoga;

        //pipperSaratoga = new aircraft();

    }
}
/* class is just a collection of Objects */
class aircraft {
    int passengers; // number of people
    int cruiseSpeed; //can use double here for 356.5 mph
    double fuelCapacity; //gallons
    double fuelBurnRate; //gallons per hour
}