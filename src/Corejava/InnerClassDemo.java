package Corejava;

public class InnerClassDemo {
    public static void main(String[] args){
        University university =new University();
        university.name ="T.U.";

        University.AccountDpt ac = university.new AccountDpt();
        ac.totalAmount =100.0;

        University.RegDpt reg = university.new RegDpt();
        reg.totalStudent =4000;

        System.out.println("University Name:"+ university.name);
        System.out.println("Total Income:"+ ac.totalAmount+"million");
        System.out.println("Total Student:"+ reg.totalStudent);
    }
}



