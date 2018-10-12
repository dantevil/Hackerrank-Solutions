package com.company;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest="",largest="";
        String s1;

        for(int i=0;i<=s.length()-k;i++)
        {
            s1=s.substring(i,i+k);
            if (s1.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = s1;
            }
            if (s1.compareTo(largest) > 0 || largest.isEmpty()) {
                largest= s1;
            }
        }
        return smallest + "\n" + largest;
    }

}
