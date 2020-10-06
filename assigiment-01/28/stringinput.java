import java.util.Scanner;
class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int n= sc.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n;i++){
            s[i]= sc.next();
        }
        
        for(String a:s){
            System.out.print(a+" ");
        }

        sc.close();
    }
}
