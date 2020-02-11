package cal.demo.java;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.*;
public class App
{
  static int addition(int a,int b)
    {
      return a+b;
    }
    static int  subtraction(int a,int b)
    {
      return a-b;
      
    }
    static int  multiplication(int a,int b)
    {
      return a*b;
    }
    static int  division(int a,int b)
    {
      return a/b;
    }
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int x=s.nextInt();  
    System.out.println("enter your option \n1.add \n2.sub \n3.mul \n4.div");    
    int c=s.nextInt();
    while(c>0)
      {
        if(c==1){
          int b=addition(a,x);
          System.out.println("The answer is:"+" "+b);
          break;
        }
        else if(c==2){
          int b=subtraction(a,x);
          System.out.println("The answer is:"+" "+b);
          break;
        }
        else if(c==3)
        {
         int b=multiplication(a,x);
          System.out.println("The answer is:"+" "+b);
          break;
        }
        else if(c==4){
          int b=division(a,x);
          System.out.println("The answer is:"+" "+b);
          break;
        }
    }
  }
}
