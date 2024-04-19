import java.io.*;
class Product 
{
    public static void main(String args[])
    {
        int a,b;
        String s;
        DataInputStream din=new DataInputStream(System.in);
        try{
            System.out.println("enter the first no.");
            a=Integer.parseInt(din.readLine());
            System.out.println("enter the second no.");
            b=Integer.parseInt(din.readLine());
            System.out.println("Product of " + a + " and " + b + " is " + (a*b));
        }
        catch(Exception e)
        {
            System.out.println("Error :" +e);
        }
    }
}
