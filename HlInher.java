import java.util.Scanner;
class A
{
    double a,b,c,d,e;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five Numbers==");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        e=sc.nextDouble();
    }
}
class B extends A
{
    double su=0,av;
    public void sum() 
    {
        su=a+b+c+d+e;
    }
    public void avg() 
    {
        av=(su/5);
    }
}
class C extends A
{
    public void larg()
    {
        if(a>=b && a>=c && a>=d && a>=e)
        {
            System.out.println(a+" Is the largest");
        }
        else if(b>=a && b>=c && b>=d && b>=e)
        {
            System.out.println(b+" Is the largest");
        }
        else if(c>=a && c>=b && c>=d && c>=e)
        {
            System.out.println(c+" Is the largest");
        }
        else if(d>=a && d>=b && d>=c && d>=e)
        {
            System.out.println(d+" Is the largest");
        }
        else if(e>=a && e>=b && e>=c && e>=d)
        {
            System.out.println(e+" Is the largest");
        }
        else
        {
            System.out.println("Your input is wrong !!Try Again!!");
        }
    }
}
class D extends B
{
    public void display() 
    {
        System.out.println("Addition of Five Numbers=="+su);
        System.out.println("Average of Five Numbers=="+av);
    }
}
public class HlInher 
{
   public static void main(String[] args) 
   {
       
        D d = new D();
        d.get();
        d.sum();
        d.avg();
        d.display();
        C c = new C();
        c.get();
        c.larg();
   }
}