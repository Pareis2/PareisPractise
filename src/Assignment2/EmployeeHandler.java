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


    List<Employee> employees;

    public EmployeeHandler(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee employeeWhoGetsMaximumSalary() {
        int maxSalary = 0;
        Employee employeeWhoIsGettingTheMaximumSalary = null;

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSalary() > maxSalary) {
                maxSalary = employees.get(i).getSalary();
                employeeWhoIsGettingTheMaximumSalary = employees.get(i);
            }
        }
        return employeeWhoIsGettingTheMaximumSalary;
    }

    public Employee employeeWhoGetsMinimumSalary() {
        Employee employeeWhoIsGettingTheMinimumSalary = employees.get(0);

        for (int i = 1; i < employees.size(); i++) {

            if (employeeWhoIsGettingTheMinimumSalary.getSalary() > employees.get(i).getSalary()) {
                employeeWhoIsGettingTheMinimumSalary = employees.get(i);
            }
        }
        return employeeWhoIsGettingTheMinimumSalary;
    }


    public Employee employeeWithMaximumSalaryInAGivenDepartment(String department){
        Employee employeeWithMaximumSalaryInAGivenDepartment = null;
        int maxSal = 0;

        for (int i = 0; i < employees.size(); i++){

            final Employee employee = employees.get(i);

            if (employee.getDepartment() == department){

                final int salary = employee.getSalary();

                if (maxSal < salary){
                    employeeWithMaximumSalaryInAGivenDepartment = employee;
                    maxSal = salary;
                }
            }
        }
        return employeeWithMaximumSalaryInAGivenDepartment;
    }

    public Employee employeeWithMinimumSalaryInAGivenDepartment(String department){

        List <Employee> employeesWhoBelongToTheGivenDepartment = new ArrayList();

        for (int i = 0; i < employees.size(); i++){

            final Employee employee = employees.get(i);

            if (employee.getDepartment() == department){
                employeesWhoBelongToTheGivenDepartment.add(employee);

            }
        }
        Employee employeeWithMinimumSalaryInAGivenDepartment = employeesWhoBelongToTheGivenDepartment.get(0);

        for (int i = 1; i < employeesWhoBelongToTheGivenDepartment.size(); i++){
            final Employee employee = employeesWhoBelongToTheGivenDepartment.get(i);
            if(employeeWithMinimumSalaryInAGivenDepartment.getSalary() > employee.getSalary() ){

                employeeWithMinimumSalaryInAGivenDepartment = employee;

            }

        }
        return employeeWithMinimumSalaryInAGivenDepartment;
    }



    public Employee oldestEmployee(){
        int maxAge = 0;

        Employee oldestEmployee = null;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() > maxAge){
                maxAge = employees.get(i).getAge();
                oldestEmployee = employees.get(i);
            }
        }
        return oldestEmployee;
    }


    public Employee youngestEmployee(){

        Employee youngestEmployee = employees.get(0);

        for (int i = 1; i < employees.size(); i++){

            if (youngestEmployee.getAge() > employees.get(i).getAge()){

                youngestEmployee = employees.get(i);
            }

        }
        return youngestEmployee;

    }

    public Employee youngestEmployeeInAGivenDepartmentWhoEarnsMaximum(String department){

         Employee youngestEmployeeInAGivenDepartmentWhoEarnsMaximum = null;

         int maxAge = 0;
         int maxSal = 0;

         for (int i = 0; i < employees.size(); i++ ){

             final Employee employee = employees.get(i);

             if (employee.getDepartment() == department){
                 final int salary = employee.getSalary();
                 final int age = employee.getAge();

                 if (maxSal < salary && maxAge < age){
                     youngestEmployeeInAGivenDepartmentWhoEarnsMaximum = employee;
                     maxAge = age;
                     maxSal = salary;

                 }
             }

         }

        return youngestEmployeeInAGivenDepartmentWhoEarnsMaximum;

    }


    public Employee oldestEmployeeInAGivenDepartmentWhoEarnsTheGivenSalary(int givenSalary){

        int maxAge = 0;
        String department;

        List<Employee> olderEmployeeInDepartmentWithGivenSalary = new ArrayList<>();
        for( int i = 0; i < employees.size(); i++){

            final Employee employee = employees.get(i);

            if(employee.getDepartment() == department){

                final int salary = employee.getSalary();
                final int age = employee.getAge();

                if (givenSalary < salary && maxAge > age){
                    olderEmployeeInDepartmentWithGivenSalary = employee;
                    maxAge = age;
                    givenSalary = salary;
                }
            }


        }


    }
/*
    public Employee oldestEmployeeInAGivenDepartmentWhoEarnsMinimum(String department){

        List <Employee> employeeInAGivenDepartmentWhoEarnsMinimum = new ArrayList<>();

        for (int i = 0; i < employees.size(); i++){

            final Employee employee = employees.get(i);

            if (employee.getDepartment() == department){
                employeeInAGivenDepartmentWhoEarnsMinimum.add(employee);

            }

        }

         Employee oldestEmployeeInAGivenDepartmentWhoEarnsMinimum = employeeInAGivenDepartmentWhoEarnsMinimum.get(0);
         for (int i = 1; i < employeeInAGivenDepartmentWhoEarnsMinimum.size(); i++){
             final Employee employee = employeeInAGivenDepartmentWhoEarnsMinimum.get(i);
             if (oldestEmployeeInAGivenDepartmentWhoEarnsMinimum.getSalary() > employee.getSalary().){

             }
         }

    }
    */

}











