import java.util.Scanner;

class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int t= sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int a=t*i;
            System.out.println(t+" * "+i+" = "+a);
        }
        sc.close();
    }
}