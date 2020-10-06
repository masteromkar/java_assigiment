import java.io.*;


class Prime implements Runnable
{
		private int no;
		Prime(int no){
			this.no=no;
					}
    public void run()
    {
       
            int cnt=0;
            for(int i=2;i<=no/2;i++)
                if(no%i==0)
                {
                    cnt++;
                    break;
                }
            if(cnt==0) {
                System.out.println(no+" Number is prime");
            }else {
            System.out.println("Not Prime Number");
            }
      }
    
}

public class main{

	    public static void main(String args[])
	    {
	        try
	        {
	           
	            Prime p1=new Prime(7);
	            Thread t1=new Thread(p1);
	            
	            t1.start();
	        }
	        catch(Exception e1){}
	    }
}
