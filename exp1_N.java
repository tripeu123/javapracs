import java.util.*;

public class exp1_N {
    public static void main(String[] args)
    {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            m=a*i;
            System.out.println(""+a+" X "+i+" = "+m);
            m=1;

        }
        
    }
    
}
