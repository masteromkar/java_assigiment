import java.util.Scanner;
class array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[10];
        int sum=0;
        System.out.println("Enter ten numbers");
        for(int i=0;i<10;i++)
        {
            arr[i]= sc.nextInt();
            sum=sum + arr[i];
        }
        sc.close();
        System.out.println("Sum of 10 element of array is "+sum);

    }
}