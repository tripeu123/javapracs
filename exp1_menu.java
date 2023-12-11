import java.util.*;
import java.lang.Math;


public class exp1_menu {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice : 1. Factorial 2.Armstrong 3. Palindrome");
        int a=sc.nextInt();

        switch(a)
        {
            case 1:
            {
                int fact=1;
                System.out.println("enter a number ");
                int x1=sc.nextInt();
                for(int i=1;i<=x1;i++){
                    fact=fact*i;

                }
                System.out.println("the factorial of " +x1+ " is: "+fact);

            }break;

            case 2:
            {
                int arm=0;
                int d;
                System.out.println("Enter a number ");
                int x2=sc.nextInt();
                int n=x2;
                while(n>0){
                    d=n%10;
                    arm=arm + (int)(Math.pow(d,3));
                    n=n/10;
                }
                if(arm==x2){
                    System.out.println("the number " +x2+ " is armstrong");
                }
                else{
                    System.out.println("the number " +x2+ " is not an armstrong");
                }

            }break;

            case 3:
            {
                System.out.println("enter a number");
                int x3=sc.nextInt();
                int rev=0,t;

                int n=x3;

                while(n>0)
                {
                    t=n%10;
                    rev=(rev*10)+t;
                    n=n/10;
                }

                if(rev==x3)
                {
                    System.out.println("the number " +x3+ " is palindrome");
                }
                else{
                    System.out.println("the number " +x3+ " is not a palindrome");
                }

            }break;

            default:
            {
                System.out.println("invalid input");
            }break;




        }

    }
    
}
