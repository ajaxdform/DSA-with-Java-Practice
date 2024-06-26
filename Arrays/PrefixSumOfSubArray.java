public class PrefixSumOfSubArray {

    public static void PrefixSum(int numbers[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++)
        {
            prefix[i] = prefix[i-1] +numbers[i];
        }

        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=0; j<numbers.length; j++)
            {
                int end = j;
                prefix[0] = numbers[0];
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum)
                {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: "+maxSum);
    }

    public static void Kaddanes(int numbers[])
    {
        int cs=0;
        int ms= Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] < 0)
            {

                cs += numbers[i];
            
                ms = Math.max(cs, ms);
                    
            }
            else
            {

                cs += numbers[i];

                if(cs < 0)
                {
                    cs = 0;
                }
            
                ms = Math.max(cs, ms);
            }
            
        }

        System.out.println("Our Max Sum of Sub Array: "+ ms);
    }
    public static void main(String args[])
    {
        int numbers[] = {-3,-2,4,-1,-2,1,5,-3};
        //PrefixSum(numbers);
        Kaddanes(numbers);

    }
}
