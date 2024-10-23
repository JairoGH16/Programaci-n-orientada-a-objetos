import Models.Customer;
import Models.Employee;
import ui.Form;

public class Main {
    public static void main(String[] args) {
        new Form();
        Employee newEmployee= new Employee("005","Jairo"
                ,"Hidalgo", 800000);
        Customer newcustomer= new Customer("006","Rafael",
                "Mendoza", "1");
        System.out.println(newEmployee.getFirstname() + " " + newEmployee.getSalary());
        System.out.println(newcustomer.getFirstname()+ " "+ newcustomer.getAccountNumber());
    }
}