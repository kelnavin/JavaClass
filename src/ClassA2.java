public class ClassA2 {
    public static void main(String[] args){
        int[] age ={10,20,30,40};
        for (int i= 0; i<= age.length-1;i++){
            System.out.println(age[i] +" ");
        }
        System.out.println("\n==========");
        for (int i:age){
            System.out.println(i+" ");
        }
    }

}
