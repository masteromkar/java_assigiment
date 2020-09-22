import java.util.Scanner;

class Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number have to enter:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the number");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int s= sc.nextInt();
        int a=0, b=0;
        for(int j=0;j<n;j++){
            if(arr[j]==s){
                a=1;
                b=j+1;
                break;
            }
            else{
                a=0;
            }
        }

        if(a==1){
            System.out.println(s+" is find at index "+b);
        }
        else{
            System.out.println(s+" is not in array");
        }

       sc.close();
    }
}