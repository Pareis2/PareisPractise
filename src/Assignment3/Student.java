package Assignment3;

public class Student {

    String id;
    String fName;
    String lname;
    String email;
    String grade;


    public Student(String id, String fName, String lname, String email, String grade) {
        this.id = id;
        this.fName = fName;
        this.lname = lname;
        this.email = email;
        this.grade = grade;
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
}