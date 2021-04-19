/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
   synchronized void printtable(int n)
   {
       for(int i=0;i<5;i++)
       {
           System.out.println(i*n);
           try{
               
               Thread.sleep(100);
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
           
       }
   }
}

class Thread1 extends Thread
{
    Test t;
    Thread1(Test t)
    {
        this.t=t;
    }
    
    public void run()
    {
        t.printtable(5);
    }
    
}

class Thread2 extends Thread
{
    Test t;
    Thread2(Test t)
    {
        this.t=t;
    }
    
    public void run()
    {
        t.printtable(8);
    }
    
}

class myclassmain{
    
    public static void main (String[] args) {
        /* code */
        Test obj=new Test();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}

