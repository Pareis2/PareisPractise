package Assignment2;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {

     Long id;
       Date dob;
       int age;
       BigDecimal salary;
       String fname;
       String lname;



    public Employee(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;

    }

    public String getLname()
    {
        return this.lname;
    }

    public void setLname(String Lname)
    {
        this.lname = lname;
    }

    public String getFname()
    {
        return this.fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public BigDecimal getSalary()
    {
        return this.salary;
    }

    public void setSalary(BigDecimal salary)
    {
        this.salary = salary;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Date getDob()
    {
        return this.dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

}
