import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortEmployees {

    public static void main (String[] args)
    {
        String[] stringArray =
                { "20", "30", "10", "60", "40", "70", "90", "50", "80" };
        System.out.println(Arrays.toString(stringArray));
        List<String> stringList = Arrays.asList(stringArray);
        Collections.reverse(stringList);
        String[] stringArray2 = stringList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));

    }


}