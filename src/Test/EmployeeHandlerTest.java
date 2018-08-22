package Test;

import Assignment2.Address;
import Assignment2.Employee;
import Assignment2.EmployeeCompratorDemo;
import Assignment2.EmployeeHandler;
import com.sun.xml.internal.bind.XmlAccessorFactory;

import java.util.Comparator;

import java.util.*;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static java.util.Arrays.sort;
import static org.junit.Assert.*;


public class EmployeeHandlerTest {


    @Test
    public void ageCheck() {
        Employee employee1 = new Employee();
        employee1.setAge(12);
        assertEquals(12);
    }


    @Test
    public void addToMapTest() throws Exception {
        Employee employee = new Employee();
        employee.addEmployee("Larry", 43);
        employee.addEmployee("Susy", 68);
        int size = employee.hashMap.size();
        assertEquals("Incorrect collection size ", 2, size);
    }


    @Test
    public void nameTest

    {
        public Employee name = new Employee();
        assertEquals("Tim", name.getFname());
    }

    @Test
    public void shouldRemoveEmployeeById() {
        Employee employee1 = new Employee("Tim", "Davos", "DEV", 1000, 30, new Date(1989, 10, 05), Long.valueOf(0001));
        Employee employee3 = new Employee("Tim", "Davos", "TST", 2000, 31, new Date(1988, 10, 05), Long.valueOf(0002));
        Employee employee4 = new Employee("Tim", "Davos", "FIN", 3000, 32, new Date(1987, 10, 05), Long.valueOf(0003));
        Employee employee2 = new Employee("Tim", "Davos", "DEV", 4000, 33, new Date(1986, 10, 05), Long.valueOf(0004));
        Employee employees = new Employee(list(employee1, employee2, employee3, employee4));

        employees.remove(2);

        assertEquals(3, employees.size());
        assertTrue(employees.contains(employee1));
        assertThat(employees).extracting("id").containsOnly(0001, 0004, 0003);
        assertThat(employees).extracting("firstName").contains("tim");

    }

    @Test
    public void testSort() {
        String[] arr = {"c", "a", "b"};
        String[] expected = {"a", "b", "c"};
        sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void youngestEmpTest() {
        List<Employee> employees2 = new ArrayList<Employee>();

        employees2.add(new Employee("Tim", "Davos", "DEV", 1000, 30, new Date(1989, 10, 05), Long.valueOf(0001)));
        employees2.add(new Employee("Homer", "Simpson", "FIN", 2000, 40, new Date(1979, 01, 04), Long.valueOf(0002)));
        employees2.add(new Employee("Stan", "Smith", "TST", 3000, 40, new Date(1979, 01, 05), Long.valueOf(0003)));
        employees2.add(new Employee("Eddard", "Stark", "DEV", 5000, 50, new Date(1969, 03, 026), Long.valueOf(0004)));
        employees2.add(new Employee("Hailey", "Griffin", "DEV", 1000, 29, new Date(1900, 12, 25), Long.valueOf(0005)));

        List<Employee> employee = Arrays.asList(Tim, Homer, Stan, Eddard, Hailey);


        Employee minAge = employee;
        .stream()
                .min(Comparator.comparing(Employee::getAge));
        .orElseThrow(NoSuchElementException::new);

        assertEquals("Should be Tim", Tim, minAge.getAge());

    }

    @Test

    public void oldestEmployee() {

        List<Employee> employees2 = new List<Employee>();
        Employee expectedResult = 50;

        Employee maxAge = employees2;
        .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        assertEquals("Should be 50", expectedResult, maxAge.getAge());
    }


}

