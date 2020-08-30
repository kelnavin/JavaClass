public class Abc {
    int n;
    public int getValue(int n)
    {
        this.n =n; //Abc a= new Abc()
        // a.n = n; same as "this.keyword"
        return this.n;
    }

    public static void main(String[] args) {
        Abc a= new Abc();
        a.getValue(5);
        System.out.println("Value is:" + a.n);
    }
}
