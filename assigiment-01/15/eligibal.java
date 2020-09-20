
import java.util.Scanner;
 class eligibal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender for Male M ,Female F");
        char g= sc.next().charAt(0);
        System.out.println("Enter the age ");
        short a=sc.nextShort();
        if(g=='M' || g=='m')
        {
            if(a >= 21)
            {
                System.out.println("you are eligibal for marrige");
            }
            else
            {
                System.out.println("you are not eligibal for marrige"); 
            }
        }
        else
        if(g=='F' || g=='f')
        {
            if(a >= 18)
            {
                System.out.println("you are eligibal for marrige");
            }
            else
            {
                System.out.println("you are not eligibal for marrige"); 
            }
        }
        else{
            System.out.println("Choose correct key word");
        }
        sc.close();
    }
}
