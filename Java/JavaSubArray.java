import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,count=0,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        { sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum=sum+a[j];
                // System.out.println(sum);
                if(sum<0)
                {
                    count++;
                    //System.out.println(count);
                }



            }
        }


        System.out.print(count);







    }
}