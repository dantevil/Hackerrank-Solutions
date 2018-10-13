import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static final int CERTAINITY=100;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        boolean b1=n.isProbablePrime(CERTAINITY);

        if(b1==true)
        {
            System.out.print("prime");
        }
        else
            System.out.print(" not prime");
        sc.close();

    }
}
