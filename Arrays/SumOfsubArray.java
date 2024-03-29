import java.util.ArrayList;
import java.util.List;

public class SumOfsubArray {
    public static List<Integer> calculateSubarraySums(int[] arr) {
        List<Integer> subarraySums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int subArraySum = 0;
            for (int j = i; j < arr.length; j++) {
                subArraySum += arr[j];
                subarraySums.add(subArraySum);
            }
        }

        return subarraySums;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        List<Integer> subarraySums = calculateSubarraySums(array);
        
        System.out.println("Sum of Individual Subarrays:");
        for (int sum : subarraySums) {
            System.out.println(sum);
        }
    }
}
