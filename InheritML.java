import java.util.Scanner;
class A
{
    double a,b,c,d,e;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five Numbers==");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
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
class InheritML extends B
{
    public void display()
    {
        System.out.println("Addition of Five Numbers=="+su);
        System.out.println("Average of Five Numbers=="+av);
    }
    public static void main(String args[]) 
    {
        InheritML c=new InheritML();
        c.get();
        c.sum();
        c.avg();
        c.display();
    }
}
