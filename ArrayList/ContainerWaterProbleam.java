/* Container with most water
 * for given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
 */

package ArrayList;

import java.util.ArrayList;

public class ContainerWaterProbleam {

    public static int solutionForProbleam_BruetForce(ArrayList<Integer> height) {
        int maxWater = 0;

        // Brute force approach -- O(n^2)

        for(int i = 0; i<height.size(); i++) {
            for(int j = i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wt = (j-i);

                int currentWater = ht * wt;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }

    public static int solutionForProbleam_2Pointers(ArrayList<Integer> height) {
        int maxWater = 0;

        // 2 Pointers approach ---o(n)

        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));  // Calculating height over here.
            int wt = rp - lp;                                   // Calculating Width over here, that is right pointer - left pointer
            int currentWater = ht * wt;                         // calculating current water.
            maxWater = Math.max(maxWater, currentWater);        // Among all storing max water level.

            if(height.get(lp) < height.get(rp)) {               // if lp is less than rp it will move forward by 1, if not rp will move backward 
              lp++;                                             // by 1 index.
            } else {
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String [] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(solutionForProbleam_2Pointers(height));
    }
}
