public class Demo {
    public Demo() {
        System.out.println("Demo Class is Created");
    }
    public Demo(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        new Demo();
        new Demo("HELLO WORLD");
    }
}
