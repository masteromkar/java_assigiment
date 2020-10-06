import java.util.Scanner;

class largeSmall{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the value");
        int large=0,small=0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            if(i==0){
                large=arr[i];
                small=arr[i];
            }else{
                if(arr[i] > large){
                    large=arr[i];
                }
                if (arr[i] < small) {
                    small=arr[i];
                }
            }
        }  
        System.out.println("The largest no is "+large+" and smallest is "+small);      
        sc.close();
    }
}