package Test;
import Assignment3.Student;
import org.junit.*;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

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
        public void testId() throws Exception{
        //set id
            this.student.setId("111");
            Assert.assertEquals("'invalid id'", "111", this.student.id);

        }

        @Test
        // set age
        Assert.assertEquals("Age must be over 10.", 0, this.student.age);

        @Test
         //invalid age
                 public void testInvalidAge(){
            Student student1 = new Student;
            thrown.expect(IllegalArgumentException.class);
            thrown.expectMessage("Age can't be a negative number.");
            this.student1.setAge(-5);



        }




    }
}
