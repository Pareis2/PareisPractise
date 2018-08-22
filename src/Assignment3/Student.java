package Assignment3;

public class Student {

    String id;
    String fName;
    String lname;
    String email;
    String grade;
    int age;




    public Student(String id, String fName, String lname, String email, String grade, int age) {
        this.id = id;
        this.fName = fName;
        this.lname = lname;
        this.email = email;
        this.grade = grade;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlnName() {
        return lname;
    }

    public void setlName(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}