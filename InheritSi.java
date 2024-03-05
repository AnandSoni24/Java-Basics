class room 
{
    int length, breadth; 
    void show( ) 
    { 
        System.out.println("\nLength="+ length +"\n"+ "Breadth=" + breadth); 
    } 
} 
class bedroom extends room 
{ 
    int h;
    void display( ) 
    { 
        System.out.println("\nHeight="+h); 
    } 
    void volume( ) 
    { 
        System.out.println("L * B * H="+ (length * breadth * h)); 
    } 
} 
class InheritSi
{
    public static void main(String args[])
    {
        bedroom m=new bedroom( );
        m.length=10;
        m.breadth=20;
        System.out.println("\nControls of Super class");
        m.show();
        m.h=50;
        System.out.println("\nControls of Derive class");
        m.display();
        m.volume();
    }
}