public class Married {
    public void getPeronInfo(String name, boolean maritual_status) {
        System.out.println("Person's Name:" + name);

        if (maritual_status) {
            System.out.println("Maritual Status: Married");
        } else
            System.out.println("Maritual Status: UnMarried");
    }

    public static void main(String[] args) {

        Married obj = new Married();
        obj.getPeronInfo("Ram", true);
        obj.getPeronInfo("Sita", false);

    }

}