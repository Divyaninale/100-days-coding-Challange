import java.util.*;
public class Two_Di_Max 
{
    public static int  Maxi(int matrix[][],int n)
    {
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
           {
            
               for(int j=0;j<matrix[0].length;j++)
               {
                  if(matrix[i][j]>max)
                  {
                    max=matrix[i][j];
                  }
               }
           }
           return max;

    }
    public static void main(String args[]) {
           Scanner sc=new Scanner(System.in);
           int matrix[][]=new int[3][3];
           System.out.println("Enter the value of Element:");
           for(int i=0;i<matrix.length;i++)
           {
               for(int j=0;j<matrix[0].length;j++)
               {
                matrix[i][j]=sc.nextInt();
               }
           }
           for(int i=0;i<matrix.length;i++)
           {
               for(int j=0;j<matrix[0].length;j++)
               {
                System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
           }
           int result=Maxi(matrix,6);
           System.out.print(result);



    }

}

