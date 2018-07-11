package Assignment2;

 import java.util.*;
public class EmployeeMap {
    public static void main(String [] args){
      //HashMap<String, Integer > hm = new HashMap<String, Integer>();
     // hm.put("a", new Integer(100));

      HashMap<String, Employee> map = new HashMap<String, Employee>();
      map = init();

      for (String s : map.keySet() ){
          System.out.println(map.get(s).getAge().getFname().getLname());
          

      }

    }

}