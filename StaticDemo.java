
class StaticDemo 
{
    static 
    {
        System.out.println("Inside static block of StaticDemo class which contains main");
    }

    public StaticDemo()
    {
        System.out.println("Inside constructor of StaticDemo Class");
    }
    public static void main(String arg[])
    {
       

        
        System.out.println("Inside main Function");
        System.out.println("Value of static No3:"+Demo.No3);    //Demo::No3
        System.out.println("Value of Static No4:"+Demo.No4);    //Demo::No4
        Demo.gun(); //Demo::gun()
        

        Demo obj1=new Demo();
        Demo obj2 =new Demo();

        obj1.fun();
    
    } 
}

class Demo 
{
   public int No1;      //Non Static charcteristics
   public int  No2;     //Non Static charcteristics
   public static int  No3;   //Static charactristics
   public static int  No4;   //Static charactristics
   
   public Demo()  //Constructor
   {
    System.out.println("Inside constructor");
    No1=11;
    No2=21;
   }

   static   //Static block
   {
        System.out.println("Inside static block of Demo class");
        No3=51;
        No4=101;

   }

   public void fun()    //nonstatic function
   {
    System.out.println("Inside non static method fun");
    System.out.println("Value of No1:"+this.No1);
    System.out.println("Value of No1:"+this.No2);
    System.out.println("Value of No1:"+this.No3);
    System.out.println("Value of No1:"+this.No4);
   }

   public static void gun() //Static method
   {
    System.out.println("Inside static method gun");
    // System.out.println("Value of No1:"+No1);
    // System.out.println("Value of No1:"+No2);
    System.out.println("Value of No1:"+No3);
    System.out.println("Value of No1:"+No4);
   }

  
}

