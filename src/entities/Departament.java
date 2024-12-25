package entities;

import java.util.ArrayList;
import java.util.List;

public class Departament {

    private String name;
    private Integer payDay;
    private Address address;

    private List<Employee> emp = new ArrayList<>();

    public Departament(){

    }

    public Departament(String name, Integer payDay,Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public List<Employee> getEmp() {
        return emp;
    }
    public void addEmp(Employee employee){
        emp.add(employee);
    }

    public void removeEmp(Employee employee){
        emp.remove(employee);
    }

    public double payroll(){
       double sum = 0;
       for (Employee employee: emp){
           sum += employee.totalSalary();
       }
       return sum;
    }
    public String employeeList(){
        String list = "";
        for (Employee employee :emp){
            list +=employee.getName();
        }
        return list;
    }


}
