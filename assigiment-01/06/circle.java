import java.util.Scanner;
class circle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.println("Enter the radius of circle");
        r= sc.nextFloat();
        double a=(3.14)*(r*r);
        double c=2*(3.14)*(r);
        System.out.println("Area of Circle is "+a+" and Circumfarance is "+c);
        
    }
}