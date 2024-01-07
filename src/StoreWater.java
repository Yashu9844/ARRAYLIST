import java.util.ArrayList;

public class StoreWater {
    public  static int storeWater(ArrayList<Integer> height){
        int maximumWater = 0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1; j< height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j - i;
                int currentWater = ht*width;
                maximumWater = Math.max(maximumWater,currentWater);
            }
        }
 return  maximumWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        //1,8.6.2,5,4,8,3,7   - given in Question

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println( storeWater(list));



    }
}
