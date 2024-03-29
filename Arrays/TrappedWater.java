public class TrappedWater {

    public static int TrappedRainWater(int height[])
    {
        int n = height.length;

        // Calculate leftmax array

        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for (int i=1; i<n; i++)
        {
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }

        // calculate rightMax array

        int rightMax[] = new int[n];

        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(height[i] ,rightMax[i+1]);
        }

        int tarppedWater = 0;
        for(int i=0; i<n; i++)
        {
            int waterLevel = Math.min(LeftMax[i], rightMax[i]);

            tarppedWater += waterLevel - height[i];
        }

        return tarppedWater;
    }
    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrappedRainWater(height)); 
    }
}
