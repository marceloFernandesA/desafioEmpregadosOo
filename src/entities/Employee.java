package entities;

public class Employee {

    private String name;
    private Double salary;

    public Employee(){

    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        salary = salary;
    }

    public double totalSalary(){
        return salary;
    }
}
