package Test;
import Assignment2.Address;
import Assignment2.Employee;
import Assignment2.EmployeeCompratorDemo;
import Assignment2.EmployeeHandler;
import com.sun.xml.internal.bind.XmlAccessorFactory;

import java.util.*;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.*;



public class EmployeeHandlerTest {



    void main() {

        @BeforeClass
        public void before(){
        }

        @AfterClass
        public void after(){
        }

        @Before
        public void setUp(){
        }

        @After
        public void tearDown(){
        }


        @Test
        public void test_array_pass()
        {
            List<String> actual = Arrays.asList("a", "b", "c");
            List<String> expected = Arrays.asList("a", "b", "c");

            assertThat(actual, is(expected));
            assertThat(actual, is(not(expected)));
        }
        @Test
        void ageCheck(){
            Employee employee1 = new Employee();
            employee1.setAge(12);
            assertEquals(12);


        }

        @Test
        void nameCheck() {
            Employee employee2 = new Employee(firstName);
            String firstName = "Larry";
            assertEquals(fName, employee2.getfName());
        }

        @Test
        void testMap(){
            Map<String, int> map = new HashMap<>();
            map.put("Ted",40);
            map.put("Xander", 50);
            map.put("Jeff", 60);

            Map<String, int> expected = new HashMap<>();
            expected.put("Ted",40);
            expected.put("Xander", 50);
            expected.put("Jeff", 60);

            assertThat(map, is(expected));

        }

        @Test
                void testObject(){
            Employee emp = new Employee("Tim", "Davos", "DEV", 1000, 30, new Date(1989, 10, 05), Long.valueOf(0001));

            assertThat(emp, hasProperty("firstName"));
            assertThat(emp, hasProperty("firstName", is("Tim")));
        }

        @Test
        void testComparator(){
            Employee first = new Employee();
            Employee second = new Employee():

            int result = areaCompare.compare(first, second);
            assertTrue =


        }






    }
}
