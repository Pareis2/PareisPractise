package Assignment2;
import java.util.*;
import java.util.Comparator;

public class EmployeeCompratorDemo {
    public static void main(String[]args){
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Tim", "Davos", "DEV", 1000, 30, new Date(1989, 10, 05), Long.valueOf(0001)));
        employees.add(new Employee("Homer", "Simpson", "FIN", 2000, 40, new Date(1979, 01, 04), Long.valueOf(0002)));
        employees.add(new Employee("Stan", "Smith", "TST", 3000, 40, new Date(1979, 01, 05), Long.valueOf(0003)));
        employees.add(new Employee("Eddard", "Stark", "DEV", 5000, 50, new Date(1969, 03, 026), Long.valueOf(0004)));
        employees.add(new Employee("Hailey", "Griffin", "DEV", 1000, 29, new Date(1900, 12,25), Long.valueOf(0005)));
        employees.add(new Employee("Scott", "Summers", "FIN", 5000, 40, new Date(1979, 11, 09), Long.valueOf(0006)));
        employees.add(new Employee("Floor", "Ceiling", "FIN", 7000, 50, new Date(1969, 01, 11), Long.valueOf(0007)));
        employees.add(new Employee("Pen", "Paper", "TST", 9000, 60, new Date(1959, 06, 09), Long.valueOf("0008")));
        employees.add(new Employee("Car", "Diesel", "DEV", 1000, 70, new Date(1949, 05, 07), Long.valueOf("0009")));
        employees.add(new Employee("Water", "Fire", "DEV", 2000, 80, new Date(1939, 01, 03), Long.valueOf(0010)));

        //sort by age
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //sort by salary
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });



    }
}