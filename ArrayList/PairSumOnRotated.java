package ArrayList;

import java.util.ArrayList;

public class PairSumOnRotated {

    public static boolean pairsum2Rotated(ArrayList<Integer> list, int target) { // Time Complexity O(n)
        int bp = -1;
        int n = list.size();
        for(int i = 0; i< list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target)   {
                return true;
            }
            
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else {
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairsum2Rotated(list, 100));
    }
}
