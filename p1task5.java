import java.util.Scanner;
public class p1task5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int sum=0;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}