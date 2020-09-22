import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number have to enter:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        int even=0,odd=0;
        System.out.println("Enter the number");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even=even+arr[i];
            }
            else{
                odd=odd+arr[i];
            }
        }
        
        System.out.println("Sum of even no is "+even+" and sum of odd no is "+odd);
        

       sc.close();
    }
}