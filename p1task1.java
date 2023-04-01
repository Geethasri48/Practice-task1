import java.util.Scanner;
public class p1task1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter the year: ");
        int n=sc.nextInt();
        if(n%400==0){
            System.out.println("Leap Year");
        }
        else if(n%100==0)
        {
            System.out.println("Not a leap year");
        }
        else if(n%4==0)
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}