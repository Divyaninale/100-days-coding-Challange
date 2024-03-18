import java.util.*;
public class Two_Dimentional_Matrix {
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



    }

}

