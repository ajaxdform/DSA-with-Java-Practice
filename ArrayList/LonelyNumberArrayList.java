/* Lonely Numbers in ArrayList(MEDIUM)
 Youaregivenanintegerarraylistnums.Anumberxislonelywhenitappearsonlyonce,and
 no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
 Return all lonely numbers in nums. You may return the answer in any order.
 Sample Input 1: nums = [10,6,5,8]
 Sample Output 1: [10,8]
 Explanation :- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
 - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
 - 5 is not a lonely number since 6 appears in nums and vice versa.
 Hence, the lonely numbers in nums are [10, 8].
 Note that [8, 10] may also be returned. */

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumberArrayList {

    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
         
        for(int i = 1; i<nums.size()-1; i++) {
            if(nums.get(i-1) + 1 < nums.get(i) && nums.get(i) < nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }

        if(nums.size() == 1) {
            list.add(nums.get(0));
        }

        if(nums.size() > 1) {
            if (nums.get(0) +1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2) +1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            } 
        }
        return list;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        LonelyNumberArrayList l1 = new LonelyNumberArrayList();
        System.out.println(l1.findLonely(nums));
    }
}
