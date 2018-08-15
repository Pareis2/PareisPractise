package Test;
import Assignment2.Address;
import Assignment2.Employee;
import Assignment2.EmployeeCompratorDemo;
import Assignment2.EmployeeHandler;
import com.sun.xml.internal.bind.XmlAccessorFactory;
import java.util.Comparator;

import java.util.*;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.*;



public class EmployeeHandlerTest {


        @Test
       public void ageCheck(){
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
        public void nameTest{
                public Employee name = new Employee();
            assertEquals("Tim", name.getFname() );
        }

    @Test
    public void shouldRemoveEmployeeById() {
        Employee employee1 = new Employee( "Tim", "Davos","DEV", 1000, 30, new Date(1989, 10, 05), Long.valueOf(0001) );
        Employee employee3 = new Employee("Tim", "Davos","TST", 2000, 31, new Date(1988, 10, 05), Long.valueOf(0002) );
        Employee employee4 = new Employee("Tim", "Davos","FIN", 3000, 32, new Date(1987, 10, 05), Long.valueOf(0003) );
        Employee employee2 = new Employee("Tim", "Davos","DEV", 4000, 33, new Date(1986, 10, 05), Long.valueOf(0004) );
        Employee employees = new Employee(list(employee1, employee2, employee3, employee4));

        employees.remove(2);

        assertEquals(3, employees.size());
        assertTrue(employees.contains(employee1));
        assertThat(employees).extracting("id").containsOnly(0001, 0004, 0003);
        assertThat(employees).extracting("firstName").contains("tim");

    }

    }

