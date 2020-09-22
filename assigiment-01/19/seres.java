import java.util.Scanner;
class seres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        int a=0;
        for(int i=1;i<=n;i++)
        {
           int sum=(i*10)+2;
            System.out.print(sum+"+ "); 
            a=a+sum;
        }
        System.out.println("After calculation "+a);
    }
}