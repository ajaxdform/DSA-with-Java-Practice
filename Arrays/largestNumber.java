
// public class largestNumber {
    
//     public static int largeNum(int number[])
//     {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<number.length; i++)
//         {
//             if(largest < number[i])
//             {
//                 largest = number[i];
//             }

//             if(smallest > number[i])
//             {
//                 smallest = number[i];
//             }
//         }
//         System.out.println("The smallest value is: " +smallest);
//         return largest;
//     }

//     public static void main(String args[])
//     {
//         int number[]= {1,2,3,4,5,6};

//         System.out.println("The largest Value is: "+ largeNum(number));
//     }
// }

/* 
 *  public static int largeNum(int number[])
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++)
        {
            if(largest < number[i])
            {
                largest = number[i];
            }

            if(smallest > number[i])
            {
                smallest = number[i];
            }
        }
        System.out.println("The Smallest Number is: "+ smallest); 
        return largest;
    }
*/

class largestNumber {

    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }

            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(getLargest(arr));
    }
}
