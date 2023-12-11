import java.util.*;

class exp1_gross{
    public static void main(String[] args)
    {
        float DA,HRA,PF,gr,net;
        float CCA=240f,PT=100f;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee no: ");
        int empno = sc.nextInt();
        System.out.println("Enter Employee name: ");
        String empname = sc.next();
        System.out.println("Enter basic salary: ");
        float basic = sc.nextFloat();

        DA= (0.7f*basic);
        HRA= (0.3f*basic);
        PF= (0.1f*basic);

        gr=(basic+DA+HRA);
        net=(gr-CCA-PT-PF);
    
        
        System.out.println("the gross salary is "+gr);
        System.out.println("the net salary is "+net);








        
        

    }
}