public class Zero_One_knapsack
{
    public static int knapsack(int wt[],int val[],int w,int n)
    {
        if(w==0 || n==0)
        {
            return 0;
        }
        else if(wt[n-1]<=w)
        {
            //include
            int ans1=val[n-1]+knapsack(wt,val,w-wt[n-1],n-1);

            //exclude

            int ans2=knapsack(wt,val,w,n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return knapsack(wt,val,w,n-1);
        }
    }
    public static void main(String args[])
    {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        System.out.println(knapsack(wt,val,w,val.length));
    }
}