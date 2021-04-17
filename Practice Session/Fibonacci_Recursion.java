/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class abc{
    
    
    static int a=0,b=1,c=0;
    static void fibo(int count)
    {
        if(count>0)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            fibo(count-1);
            
        }
        
        
        
    }
    
    public static void main(String args[])
    {
        
        int count=10;
        System.out.print(a+"  "+b);
        fibo(count-2);
    }
    
}