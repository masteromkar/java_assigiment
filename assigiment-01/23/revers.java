import java.util.Scanner;
 
class revers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many no you ahe enter");
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        for(int j=0;j<=(n/2);j++){
            int temp;
            temp=a[j];
            a[j]=a[n-j-1];
            a[n-j-1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        sc.close();
    }
}