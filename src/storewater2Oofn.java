import java.util.ArrayList;

public class storewater2Oofn {
    static int stwater(ArrayList<Integer> height){

        int maximumWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp<rp){

            int ht = Math.min(height.get(lp),height.get(rp) );
            int width = rp-lp;
            int currentWater = ht*width;
            maximumWater = Math.max(maximumWater,currentWater);


            //update
            if(height.get(lp) <height.get(rp)){

                lp++;
            }
            else {
                rp--;
            }




        }
return maximumWater;
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
        System.out.println( stwater(list));
    }
}
