package Test;
import Assignment3.Student;
import org.junit.*;
import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.*;

class ProgressCardTest  {


     void main() {
        Student student = new Student();

        @BeforeClass
        public void before(){
            System.out.println("Before Class");
         }

        @AfterClass
        public void after(){
            System.out.println("After Class");
         }

        @Before
        public void setUp(){
            System.out.println("Before");
            student = new Student();
        }

        @After
        public void finish(){

            System.out.println("After");
            student = new Student();
         }


        @Test
        void exception(){
            Throwable exception = expectThrows(IllegalArgumentException.class, () -> Student.setId("23"));
            assertEquals("Id must be an Integer.", exception.getMessage());
         }

        @Test
         void nameCheck() {
             Student student = new Student(fName);
             String fName = "Larry";
             assertEquals(fName, student.getfName());
         }

        @Test
        void gradeCheck(){
             ProgressCard progress = new ProgressCard();
             assumeTrue("90".equals.getGrade("A"));
         }


        @Test
         //invalid age
         public void testInvalidAge(){
            Student student1 = new Student;
             this.student1.setAge(-5);
            thrown.expect(IllegalArgumentException.class);
            assertFalse("Age can't be a negative number.");

        }




    }
}
