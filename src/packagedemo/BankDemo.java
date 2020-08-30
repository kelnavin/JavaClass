package packagedemo;
import PackageP1.Bank;
import PackageP1.pp.Employee;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankname ="Sanima Bank";
        bank.address ="Kurmaripati, Lalitpur";

        System.out.println("Bank Name:" + bank.bankname);
        System.out.println("Bank Address:" + bank.address);

        Employee employee=new Employee();
        employee.employeeInfo();


    }

}

