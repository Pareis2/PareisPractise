package Assignment2;

public class Address {

    String respodentAddress;
    String correspondenceAddress;
    String email;
    String department;

    public Address(String RespodentAddress, String CorrespondenceAddress, String Email, String Department)
    {
        this.correspondenceAddress = CorrespondenceAddress;
        this.respodentAddress = RespodentAddress;
        this.email = Email;
        this.department = Department;
    }

    public String getCorrespondenceAddress()
    {
        return this.correspondenceAddress;
    }
    public void setCorrespondenceAddress(String correspondenceAddress)
    {
        this.correspondenceAddress = correspondenceAddress;
    }

    public String getRespodentAddress()
    {
        return this.respodentAddress;
    }
    public void setRespodentAddress(String respodentAddress)
    {
        this.respodentAddress = respodentAddress;
    }

    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getDepartment()
    {
        return this.department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }







}
