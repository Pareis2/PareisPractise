package Assignment2;

import Assignment2.Employee;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.lang.Long;

public class EmployeeHandler extends Employee  {


    public EmployeeHandler(String firstName, String lastName, BigDecimal salary, int age, Date dob, Long id)
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

    public long getId(){return id;}

    public String toString() {
        return firstName + lastName + age + dob + salary;
    }

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2018-06-14");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Tim", "Sanders", 60000.00, 35, date = LocalDate.parse("01-01-1983", formatter), 000001));
        emps.add(new Employee("Amelia", "Thompson", 75000, 36, new SimpleDateFormat("dd-mm-yyyy").parse("31-12-1982"), 000002));
        emps.add(new Employee("Frankie", "Paul", 100000, 50, new SimpleDateFormat("dd-mm-yyyy").parse("09-10-1967"), 000003));
    }
}}