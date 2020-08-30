public class Cat {
    public Cat() //cat as a Constructor
    {
        //this();
        System.out.println("Cat Object is Created.");
    }

    public Cat(String action){
       this();
        System.out.println("Cat is "+action);

    }

    public static void main(String[] args)
    {
       // new Cat(); //ONLY Cat is Created will be printed
        new Cat( "Sleeping");
    }

}

