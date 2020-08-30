package InheritanceClass;
class Math{
    int x;
    public void info() {
        System.out.println("Parent Method");
    }
}

public class SuperkeywordDemo extends Math{
    int y;
    public void sum(int a, int b){
        super.x =a;
        this.y = b;
        System.out.println("Total Sum: " +(super.x + this.y));
    }
    public void info1() {
        super.info();
        System.out.println("Child Method");
    }
    public static void main( String[] args) {
        SuperkeywordDemo ob = new SuperkeywordDemo();
        ob.sum(11,12);
        ob.info1();
    }
}
