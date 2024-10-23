package Models;

public class Employee extends Person {
    private int salary;

    public Employee(String id,String Firstname, String Lastname,int salary){
        super(Firstname,Lastname);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
