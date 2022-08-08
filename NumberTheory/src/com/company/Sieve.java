package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {
        List<Long> list1=new ArrayList<>();
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
       List<Long> l= cve(num,list1);
       for(long i:l)
       {
           System.out.println(i);
       }


    }
    public static List<Long> cve(int n,List<Long> list)
    {
        boolean [] nums=new boolean [n];
        nums[0]=true;
        for(long i=2;i<n;i++)
        {
            if (nums[(int) i]==false)

            {
                list.add(i);
                for(long j=i*i;j<n;j+=i)
                {
                    nums[(int) j]=true;
                }
            }
        }
        return list;
    }
}
