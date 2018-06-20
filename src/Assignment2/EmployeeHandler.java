package Assignment2;

import Assignment2.Employee;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.lang.Long;
import java.util.List;

public class EmployeeHandler   {
private List<Employee>employees;

    public EmployeeHandler(List<Employee>employees)
    {
        if (employees == null || employees.isEmpty()){
            throw new RuntimeException("Please pass is a valid list of employees");
        }
        this.employees = employees;

    }

    public Employee employeeWithMaxSalary(){
        BigDecimal maxSal = BigDecimal.ZERO;
        Employee employeeWithMaxSal = null;
        for Employee em = new Employee(){
            if(maxSal = compareTo(em.getSalary();) < 0;
            maxSal = em.getSalary();
            employeeWithMaxSal = em;
        };
        return null;
    }

    public Employee employeeWithMinSalary(){
        BigDecimal minSal = BigDecimal.ZERO;
        Employee employeeWithMinSal = null;
        for Employee em = new Employee() {
        if(minSal =compareTo(em.getSalary())< 0
            minSal >em.getSalary();
            {
                minSal = em.getSalary();
            }

        };

        return null;

    }

    public Employee employeeWithMaxSalaryInDepartment(String Department){

        BigDecimal maxSal = BigDecimal.ZERO;
        Employee employeeWithMinSalaryInDepartment = null;
        for Employee em = new Employee(){
            if(maxSal = compareTo(em.getSalary();)
                    if (Department =  "DEV");
                    )
        }

        return null;

    }

    public Employee employeeWithMinSalaryInDepartment(String Department){
        BigDecimal minSal = BigDecimal.ZERO;
        Employee employeeWithMinSalaryInDepartment = null;
        for Employee em = new Employee(){
            if( minSal = compareTo(em.getSalary());
            if(Department = "DEV");
        }

        return null;}


    }

/*    public Employee employeeBelongingToDepartment(String Department){

        String firstname;
        Employee employeeBelongingToDepartment = null;
        for (int x = 0; x < list.size(); x++){
            list.get(x).getDepartment());
        }



        return null;}
        */
}