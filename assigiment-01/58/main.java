import java.util.Scanner;

public class main {

	public static void main(String[] args) throws MyExcept {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String[] str= {"sunday","monday","tuesday","Wednesday","thursday","friday","saturday"};
//			System.out.println(str[7]);
			System.out.println("Enter the number");
			int no=sc.nextInt();
			
			if(no>=str.length || no<0)
			{
				throw new MyExcept();
			}else {
				System.out.println(str[no]);
			}
			
	}

}

class MyExcept extends Exception{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ArrayOutOfBoundsExceptions";
	}
}
