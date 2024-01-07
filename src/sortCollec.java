
import java.util.ArrayList;
import java.util.Collections;
public class sortCollec {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(4);
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list); // Ascending

        Collections.sort(list,Collections.reverseOrder());   //descending

        System.out.println(list);
    }
}
