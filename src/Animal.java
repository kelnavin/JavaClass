public class Animal {
    String name;
    int age;
    public void eat() {
        System.out.println("Eating Something...");
    }


    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Kitty Cat";
        cat.age = 2;

            System.out.println("Animal Name:" + cat.name);
            System.out.println("Animal Age:" + cat.age);
            System.out.println(cat.name + " ");
            cat.eat();

    }
}