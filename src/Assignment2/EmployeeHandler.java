package Assignment2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
import java.util.ArrayList;




public class EmployeeHandler extends Employee {

    EmployeeHandler(String firstName, String lastName, BigDecimal salary, int age, Date dob, Long id)
    {
        super(firstName, lastName, salary, age, dob,id);
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Date getDoB() {
        return dob;
    }
    //public long getId(){return id;}


    public static void main(String[] args) {

        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Tim", "Sanders", 60000, 35, new SimpleDateFormat("dd-mm-yyyy").parse("01-01-1983"), 001));
        emps.add(new Employee("Amelia", "Thompson", 75000, 36, new SimpleDateFormat("dd-mm-yyyy").parse("31-12-1982"), 002));
        emps.add(new Employee("Frankie", "Paul", 100000, 50, new SimpleDateFormat("dd-mm-yyyy").parse("09-10-1967"), 003));




    }


   /*public void add (Employee e)
   {
       Employee.add(e.getName(), e);

   }*/


}