import java.io.*;
class Minimum
{
    public static void main(String args[])
    {
        System.out.println("Jibin Sabu John");
        DataInputStream din;
        int a,b,c,min;
        String s;
        din = new DataInputStream(System.in);
        try
        {
            System.out.println("\nEnter the first number : ");
            s=din.readLine();
            a=Integer.parseInt(s);
            System.out.println("\nEnter second number : ");
            s=din.readLine();
            b=Integer.parseInt(s);
            System.out.println("\nEnter third number : ");
            s=din.readLine();
            c=Integer.parseInt(s);
            min= c<(a<b?a:b)?c:(b<a?b:a); 
            System.out.println("Minimum number = "+min);
            
        }
        catch(Exception e) 
        {
            System.out.println("Error : "+e);
        }
        
    }
}