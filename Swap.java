import java.io.*;
class Swap
{
    public static void main(String args[])
    {
        System.out.println("JIBIN SABU JOHN");
        DataInputStream din;
        int a,b,temp;
        String s;
        din = new DataInputStream(System.in);
        try
        {
            System.out.println("\nenter the first number :");
            s=din.readLine();
            a=Integer.parseInt(s);
            System.out.println("\nenter the second number :");
            s=din.readLine();
            b=Integer.parseInt(s);
            System.out.println("values before swapping : \na = " +a+ " \nb = " +b);
            temp=a;
            a=b;
            b=temp;
            System.out.println("values after swapping : \na = " +a+ " \nb = " +b);


        } 
        catch (Exception e)
        {
            System.out.println("error :"+e);
        }
    }
}