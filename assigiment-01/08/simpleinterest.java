import java.util.Scanner;

class simpleinterest
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p=a.nextDouble();
        System.out.println("Enter the interest rate");
        float r=a.nextFloat();
        System.out.println("Enter the time in years");
        int t=a.nextInt();
        double amount=(p*t*r)/100;
        System.out.println("Simple interest is "+amount);

        
    }
}