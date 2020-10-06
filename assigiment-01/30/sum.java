import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][] = new int[3][3];
        int sum=0;
        System.out.println("Enter the element of array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]= sc.nextInt();
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }
}