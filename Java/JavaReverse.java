import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len=A.length();
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+A.charAt(i);
        }


        if(rev.equals(A))
        {
            System.out.print("Yes");
        }
        else
            System.out.print("No");

    }
}



