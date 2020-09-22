import java.util.Scanner;

class sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        System.out.println("Enter ten number");
        for(int i=0;i<10;i++){
            arr[i]= sc.nextInt();
        }

        for(int a=0;a<10;a++){
            for(int b=a+1;b<10;b++){
                if(arr[a] < arr[b]){
                    int temp;
                    temp=arr[b];
                    arr[b]=arr[a];
                    arr[a]=temp;
                }
            }
        }
        
        for(int j=0;j<10;j++){
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}