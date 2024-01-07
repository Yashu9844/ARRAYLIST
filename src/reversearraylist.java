import java.util.*;
import java.util.ArrayList;
public class reversearraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(1);list.add(4);
        System.out.println(list);


        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");             //TC -0(n)
        }
        System.out.println();
    }
}
