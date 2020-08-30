package InheritanceClass;

public class MultiMarket {
    public static void main(String[] args) {
        Toyota toyota= new Toyota();
        toyota.name ="Toyota Prado";
        toyota.fuelCapacity = 100;
        toyota.model="tp2020";

        System.out.println("Car:" + toyota.name + "\nFuel Capacity: "
                + toyota.fuelCapacity + "ltrs. \nModel: " + toyota.model);
        System.out.println("------------------");
        BMW bmw=new BMW();
        bmw.name="BMW 2020";
        bmw.fuelCapacity=90;
        bmw.model="bmw-2020";
        bmw.color="Black";
        System.out.println("Car: " + bmw.name + "\nFuel Capacity: "
                + bmw.fuelCapacity + " ltrs. \nModel: " + bmw.model+"\nColor: "+bmw.color);

    }
}
