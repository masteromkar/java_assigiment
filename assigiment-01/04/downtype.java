import java.util.Scanner;

class downtype{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        short a= sc.nextShort();
        System.out.println("Enter the value of B: ");
        short b= sc.nextShort();
        int c= a + b;
        byte d=(byte)c;
         System.out.println("Sum of A and B " +d);

    }
}
