import java.util.Scanner;

class dayinymd
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of days");
        int D= sc.nextInt();
        int t=D;
        int y= D/365;
        D= D%365;
        int m=D/30;
        D= D%30;
        System.out.println(t+"Days are "+y+" years "+m+" months "+D+" days ");
        sc.close();

    }
}