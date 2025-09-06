class Demo
{
    public void fun()
    { System.out.println("Inside Demo fun"); }

    public final void gun()
    {  System.out.println("Inside Demo gun"); }
}

class Hello extends Demo
{
    public void fun()         //Overring allowed
    { System.out.println("Inside Hello fun"); }
    /*public void gun()                     // not allowed
    { System.out.println("Inside Hello gun");} */        
}
class FinalDemo3
 {
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
       
        
    }
}
