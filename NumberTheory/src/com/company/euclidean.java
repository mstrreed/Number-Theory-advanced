package com.company;

public class euclidean {
    public static void main(String[] args) {
        System.out.print(gcd(98,56));
    }
    public static int gcd(int a,int b)
    {
        if (a == 0 || b == 0) {
            return a;
        }
        int rem=a%b;
        a=b;
        b=rem;
       return gcd(a,b);
    }
}
