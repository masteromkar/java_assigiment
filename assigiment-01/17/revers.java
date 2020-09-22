import java.util.Scanner;

class revers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int a=num,rev=0;
        while(a!=0)
        {
            int temp = a % 10;
            rev=rev*10 +temp;
            a=a/10;
        }
        System.out.println(num+" after revers "+rev);
        sc.close();
    }
}