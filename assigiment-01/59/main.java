class val{  
	  
    static void validate(int age)throws InvalidAgeException{  
      if(age<18)  
       throw new InvalidAgeException("not valid valid Age");  
      else  
       System.out.println("welcome to vote");  
    }  
      
    public static void main(String args[]){  
       try{  
       validate(20);  
       }catch(Exception m){System.out.println("Exception occured: "+m);}  
   
        
   }  
 }

class InvalidAgeException extends Exception{
     String str;
  InvalidAgeException(String s) {
     // TODO Auto-generated constructor stub
      this.str=s;
 }
 @Override
 public String toString() {
 // TODO Auto-generated method stub
 return str;
 }
}