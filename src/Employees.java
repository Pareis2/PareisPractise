
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;


public class Employees
{
    String name;
    Date birthdate;

    Employees(String name, Date birthdate){ this.name = name; this.birthdate = birthdate; }

    public String getName(){return name;}
    public void setNAme(String name){this.name = name;}
    public Date getBirthdate(){return birthdate;}
    public void setBirthdate(Date birthdate){this.birthdate = birthdate;}

    public static void main (String[]args) throws ParseException
    {

        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("John", new SimpleDateFormat("dd-mm-yyyy").parse("01-01-1982")));
        list.add(new Employees("Ted", new SimpleDateFormat("dd-mm-yyyy").parse("09-12-1966")));
        list.add(new Employees("Amelia", new SimpleDateFormat("dd-mm-yyyy").parse("01-12-1066")));
        list.add(new Employees("Sarah", new SimpleDateFormat("dd-mm-yyyy").parse("04-04-1978")));
        list.add(new Employees("Amanda", new SimpleDateFormat("dd-mm-yyyy").parse("07-7-2000")));

        Collections.sort(list, new Comparator<Employees>() { public int compare(Employees e1, Employees e2)
        {
            public int compare(Employees e1, Employees e2)   //build error
            {
                return Long.valueOf(e1.getBirthdate().getTime()).compareTo(e2.getBirthdate().getTime());
            }
        }
        });

        System.out.println("Employees");
        for (Employees employees : list) {System.out.println(employees.getName() + " " + employees.getBirthdate());}



    }

}
