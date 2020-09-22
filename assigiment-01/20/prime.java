import java.util.Scanner;
class prime {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter the range of number");
    //      int a= sc.nextInt();
    //  int b= sc.nextInt();
    //      sc.close();
    //     System.out.print("prime number between "+a+" and "+b+" :");
    //     while(a<b)
    //     { 
    //         int c=0;
    //         if( a <= 1){
    //             ++a;
    //             continue;
    //         }

    //         for(int i=2;i<=b/2);i++)
    //         {
    //             if(a % i==0){
    //                 c=1;
    //                 break;
    //             }
    //         }

    //         if (c==0) {
    //             System.out.print(a+" ");
    //         }

    //     ++a;
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range of number");
         int low= sc.nextInt();
     int high= sc.nextInt();
         sc.close();
        

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}
