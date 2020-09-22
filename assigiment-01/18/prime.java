import java.util.Scanner;
class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int m=0,f=0;
        m=n/2;
        if(n==0 || n==1)
        {
            System.out.println("The number is not prime");
            f=1;
        }
        else{
            for(int i=2;i<=m;i++)
            {
                if (n%i==0) {
                    System.out.println("The number is not prime ");
                    f=1;
                    break;
                }
                
            }
            if(f==0){
                System.out.println("The number is prime number");
            }
        }
        
        
        sc.close();

    }    
}