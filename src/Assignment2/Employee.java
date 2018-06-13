package Assignment2;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {

    public Long id;
    public Date dob;
    public int age;
    public BigDecimal salary;
    public String firstName;
    public String lastName;


    public Employee(String firstName, String lastName, BigDecimal salary, int age, Date dob, Long id ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
        this.dob = dob;
        this.id = id;

    }

    public String getLname() {
        return this.lastName;
    }

    public void setLname(String Lname) {
        this.lastName = lastName;
    }

    public String getFname() {
        return this.firstName;
    }

    public void setFname(String fname) {
        this.firstName = fname;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
