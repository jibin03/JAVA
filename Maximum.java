import java.io.*;
class Maximum
{
	public static void main(String args[])
	{
		DataInputStream din;
		String s;
		int a,b,c;
		din=new DataInputStream(System.in);
		try
		{
		System.out.println("Enter the first no");
                s=din.readLine();
                a=Integer.parseInt(s);
		System.out.println("Enter the second no");
                s=din.readLine();
                b=Integer.parseInt(s);
		System.out.println("Enter the third no");
                s=din.readLine();
                c=Integer.parseInt(s);
		if(a>b && a>c)
		{
			System.out.println(a+" is the maximum"); 
		}
		else if(b>c)
		{
			System.out.println(b+" is the maximum"); 
		}
		else
		{
			System.out.println(c+" is the maximum"); 
		}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e); 
		}
	}
}