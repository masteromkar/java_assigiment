import java.util.Scanner;
class arrayrow
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many array you want");
        int n=sc.nextInt();
        int a[][]= new int[n][];
        for(int i=0;i<n;i++){
            System.out.println("how many element in array "+(i+1));
            int m=sc.nextInt();
            for(int j=0;j< m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("no of 1d array in 2d array is"+n);

        for(int[] arr:a){
            for(int s:arr){
                    System.out.print(" "+s);
            }
        }
        
        sc.close();
    }
}