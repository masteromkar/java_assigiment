package assignments;

import java.util.Scanner;

//write a programme to check how many vowels in string
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name");
		String name=sc.next();
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		
		System.out.println(count+" vowels in the name");
	}

}