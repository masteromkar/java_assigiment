import java.util.Scanner;
class greternum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three number");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int g;
        if(a >b )
        {
            g=(a > c) ? a:c;
        }
        else{
            g=(b > c) ? b :c;
        }
        System.out.println("the greatest no is "+g);
        scan.close();
    }
    
}
