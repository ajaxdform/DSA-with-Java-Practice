package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean targetSum_BruteForce(ArrayList<Integer> sortedList, int target) {
        // Brute Force Opproach
        for(int i = 0; i< sortedList.size(); i++) {
            for(int j = i+1; j< sortedList.size(); j++) {
                if(sortedList.get(i) + sortedList.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean targetSum_2Pointer(ArrayList<Integer> sortedList, int target) {
        int lp = 0; 
        int rp = sortedList.size()-1;

        while(lp != rp) {
            if(sortedList.get(lp) + sortedList.get(rp) == target) {
                return true;
            }

            if(sortedList.get(lp) + sortedList.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> sortedList = new ArrayList<>();

        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(4);
        sortedList.add(5);
        sortedList.add(6);
        sortedList.add(7);

        int target = 5;

        System.out.println(targetSum_2Pointer(sortedList, target));
    }
}
