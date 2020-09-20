import java.util.Scanner;

class expression
{
	public static void main (String args[])
	{
		int x,y,z;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of x:");
		x= sc.nextInt();
		y=(x*x)+(3*x)-7;
		System.out.println("1st experssion y=X^2 +3x -7 where value of y " +y);
		y=x++ + ++x;
		System.out.println("2nd experssion y=x++ + ++x where value of x and y  " +x+" "+y);
		z=x++ - --y - --x + x++;
		System.out.println("3rd experssion z=x++ - --y - --x + x++ where value of x,y and z " +x+" "+y+" "+z);
		
		boolean a,b,c;
		Scanner ab = new Scanner (System.in);
		a= ab.nextBoolean();
		b= ab.nextBoolean();
		c= (a&&b) || !( a || b);
		System.out.println("4th experssion z=x && y || !(x || y)where value of x,y,z " +a+" "+b+" "+c);;
		
	}
}