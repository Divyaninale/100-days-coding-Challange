public class TrappingRainWater
{
    public static int TrappedRainwater(int height[])
    {
        int LeftMax[]=new int[height.length];
        int RightMax[]=new int[height.length];
          
        //Calculate leftmax boundry
        LeftMax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }
        //Calculate Rightmax boundry
        RightMax[0]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
        //calculate waterlevel
        int TrappedWater=0;
        for(int i=0;i<height.length;i++)
        {
            int waterlevel=Math.min(LeftMax[i],RightMax[i]);

            //TrappedWater
            TrappedWater+=waterlevel-height[i];
        }
        return TrappedWater;


    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        int result=TrappedRainwater(height);
        System.out.println(result);
    }
}