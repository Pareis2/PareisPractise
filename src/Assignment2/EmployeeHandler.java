package Assignment2;
import java.util.Date;
import java.math.BigDecimal;
import java.util.ArrayList;


public class EmployeeHandler extends Employee
{

    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public BigDecimal getSalary(){return salary;}
    public int getAge(){return age; }
    public Date getDoB(){return dob;}
    public long getId(){return id;}


    public static void main (String[]args)
     {

         ArrayList<Employee> emps = new ArrayList<Employee>();
         emps.add(new Employee());

     }


   /*public void add (Employee e)
   {
       Employee.add(e.getName(), e);

   }*/


}