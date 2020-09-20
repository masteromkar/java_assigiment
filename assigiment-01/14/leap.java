import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int y= sc.nextInt();
        if(y%400==0)
        {
            System.out.println(y+" is leap Year");   
        }
        else if(y%100==0){
            System.out.println(y+" is not leap Year");
        }
        else if(y%4==0){
            System.out.println(y+" is leap Year");
        }
        else{
            System.out.println(y+" is not leap Year");
        }
        sc.close();
    }
    
}
