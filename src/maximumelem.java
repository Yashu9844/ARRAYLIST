import java.util.*;
public class maximumelem {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(4);
        System.out.println(list);
        int maximum =Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
//            if(maximum < list.get(i)){
//                maximum = list.get(i);           //OR
//            }
           maximum = Math.max(maximum, list.get(i));
        }
        System.out.println(maximum);
    }
}
