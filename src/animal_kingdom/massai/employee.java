package animal_kingdom.massai;

import java.util.SortedMap;

public class employee{

    public employee(String name,String role,long salary) {
        this.role=role;
        this.name=name;
        this.salary=salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole(){
        return role;
    }

    private String role;
    private String name;
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public employee(){

    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    
}
