public class Employee {
    public void info(){
        System.out.println("Employee Object is Created:");
    }
        public int getMaxEmpAge(){
            return 50;
    }
}

class EmployeeEmp{
    public static void main(String[] args) {
        Employee el = new Employee();
        el.info();

        int maxAge = el.getMaxEmpAge();
        System.out.println("Maximum Employee Age is:" + maxAge);
    }
}





























































































