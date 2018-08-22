package Assignment3;


public class StudentsReport {

    String subject;
     String[] grade = new String[6];


    public StudentsReport( String[] grade, String subject) {
        this.grade = grade;
        this.subject = subject;

    }


    public String[] getGrade() {
        return grade;
    }

    public void setGrade(String[] grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}


