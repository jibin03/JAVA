import java.io.*;
class Sum
{
    public static void main(String args[])
    {
        System.out.println("JIBIN SABU JOHN");
        DataInputStream din;
        int a,b;
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
            System.out.println("\nsum of  "+a+" and "+b+" is " +(a+b));

        } 
        catch (Exception e)
        {
            System.out.println("error :"+e);
        }
    }
}