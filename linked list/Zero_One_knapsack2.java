public class Zero_One_knapsack2
{
    public static int knapsack(int wt[],int val[],int w,int n,int dp[][])
    {
        if(w==0 || n==0)
        {
            return 0;
        }
        if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }
        else if(wt[n-1]<=w)
        {
            //include
            int ans1=val[n-1]+knapsack(wt,val,w-wt[n-1],n-1,dp);

            //exclude

            int ans2=knapsack(wt,val,w,n-1,dp);
            dp[n][w]= Math.max(ans1,ans2);
            return dp[n][w];
        }
        else{
            dp[n][w]= knapsack(wt,val,w,n-1,dp);
            return dp[n][w];
        }
    }
    public static void main(String args[])
    {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;

        int dp[][]=new int[val.length+1][w+1];
        {
           for(int i=0;i<val.length+1;i++)
           {
            for(int j=0;j<w+1;j++)
            {
                dp[i][j]=-1;
            }
           }
        }
        System.out.println(knapsack(wt,val,w,val.length,dp));
    }
}