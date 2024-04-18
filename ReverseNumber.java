import java.io.*;
class ReverseNumber{
    public static void reverseNumber(int num) {
        int reversed = 0;
        while(num!=0){
            int digit = num %10;
            reversed= reversed*10+digit;
            num/=10;
        }
        System.out.println("Reversed Number"+reversed);
}
public static void main(String args[])
{
    DataInputStream din=new DataInputStream(System.in);
    int num;
    try{
        System.out.print("Enter a number:");
        num=Integer.parseInt(din.readLine());
        reverseNumber(num);;
        din.close();
    }
    catch(Exception e){
        System.out.println("Error:" +e);
    }
}
}