/* Most Frequent Number following Key (EASY)
 You are given an integer Arraylist nums. You are also given an integer key, which is present in
 nums.
 For every unique integer target in nums, count the number of times target immediately follows
 an occurrence of key in nums. In other words, count the number of indices i such that:
 0 <= i <= nums.size() - 2,
 nums.get(i) == key and,
 nums.get(i+1) == target.
 Return the target with the maximum count.
 (Assumption- that the target with maximum count is unique.)
 Sample Input 1 :nums = [1,100,200,1,100], key = 1
 Sample Output 1 :  100
 Explanation :
 For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.
 No other integers follow an occurrence of key, so we return 100 */

package ArrayList;

import java.util.ArrayList;

public class MostFrequentFollowedKey {

    public static int findOccurancecount(ArrayList<Integer> list, int key) {
        int result[] = new int[1000];

        for(int i= 0; i< list.size(); i++) {
            if(list.get(i) == key) {
                result[list.get(i+1)]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++) {
            if(result[i] > max) {
                max = result[i];
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key = 1;
        System.out.println(findOccurancecount(list, key));
    }
}
