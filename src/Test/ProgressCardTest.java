package Test;
import Assignment3.Student;
import Assignment3.StudentsReport;
import org.junit.*;
import static org.junit.Assert.*;

//import static org.junit.jupiter.api.Assertions.*;

class ProgressCardTest  {


     void main() {
        Student student = new Student();

        @BeforeClass
        public void before(){
           // System.out.println("Before Class");
         }

        @AfterClass
        public void after(){
            //System.out.println("After Class");
         }

        @Before
        public void setUp(){
            //System.out.println("Before");
            //student = new Student();
        }

        @After
        public void finish(){

            //System.out.println("After");
            //student = new Student();
         }



         @Test
         void testArray(){
             StudentsReport sr = new StudentsReport();
             String[] expected = {"A","B", "C", "D", "E", "Fail"};
             String[] actual =  {"A","B", "C", "D", "E", "Fail"};
             assertArrayEquals(expected, actual);

         }
         @Test
         void ageCheck(){
            Student student1 = new Student();
            student1.setAge(12);
            assertEquals(12);


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







    }
}
