package com.company;

public class BinExpBest {

    public double myPow(double x, int n) {
        if(n>0)
        {
            double pow=binExp(x,n);
            return pow;
        }
        else
        {
            double pow=binExp(x,n);
            return (1/pow);
        }
    }
    public static double binExp(double a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        double res=binExp(a,b/2);
        if(b%2!=0)
        {
            return (a*(res*res));
        }
        else
        {
            return ((res*res));
        }
    }
}