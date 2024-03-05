import java.util.Scanner;
interface Interface1 
{
    int Sum(int a,int b); 
}
  
interface Interface2 
{
    int Average(int c); 
}
  
class InterfaceEx implements Interface1, Interface2 
{
    public int Sum(int a,int b) 
    {
        return a+b;
    }
    public int Average(int sum) 
    {
        return (sum/2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        InterfaceEx o1 = new InterfaceEx();
        int a,b,c;
        System.out.println("Enter Two Numbers==");
        a = sc.nextInt();
        b = sc.nextInt();
        c = o1.Sum(a,b);
        System.out.println("Sum of Two Numbers=="+c);
        System.out.println("Average of Two Numbers=="+o1.Average(c));
    }
}
