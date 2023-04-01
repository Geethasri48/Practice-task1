import java.util.Scanner;
public class p1task2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Please enter a alphabet: ");
        char ch=sc.nextLine().charAt(0);
		if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
		{
			System.out.println("It's a Vowel!");
		}
		else if((ch=='b') || (ch=='c') || (ch=='d') || (ch=='f') || (ch=='g') || (ch=='h') || (ch=='j') || (ch=='k') || (ch=='l') || (ch=='m') || (ch=='n') || (ch=='p') || (ch=='q') || (ch=='r') || (ch=='s') || (ch=='t') || (ch=='v') || (ch=='w') || (ch=='x') || (ch=='y') || (ch=='z'))
		{
			System.out.println("It's a Consonant");
		}
        else{
            System.out.println("ERROR!!!!!");
        }
    }
}