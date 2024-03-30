public class BinarySeach {

    public static int Binary(int number[], int key)
    {
        int start = 0; 
        int end = number.length-1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(number[mid] == key)
            {
                return mid;
            }
            if (number[mid] < key)
            {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int number[] = {1,2,3,4,5,6,7};
        int key = 5;

        System.out.println("The index Of key is: " +Binary(number, key));
    }
}
    