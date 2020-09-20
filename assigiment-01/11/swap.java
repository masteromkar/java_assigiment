import java.util.Scanner;

class swap
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two number A & B");
        int a= scan.nextInt();
        int b= scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping A "+a+" B "+b);
        scan.close();
    }
}