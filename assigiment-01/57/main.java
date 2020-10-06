public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="Write a program to convert very first character ";

		
			String temp ="";
		 String[] arr = str.split(" ");
		    for(String st:arr)
		    {
		    	StringBuffer sb=new StringBuffer(st);
		    	temp+=sb.reverse()+" ";
		    }
		    	
		 System.out.println(temp);  
		   
	}

}