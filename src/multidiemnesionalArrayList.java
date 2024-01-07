import java.util.ArrayList;

public class multidiemnesionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(10);

        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);


        //in Nested Loop Look Like matrix

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> current = mainList.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(current.get(j) + " ");
            }
            System.out.println();

        }

    }
}
