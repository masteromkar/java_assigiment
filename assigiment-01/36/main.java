import java.util.Scanner;

class MathOperation{
    static int multiply(int a,int b){
        return a*b;
    }

    static double multiply(float a,float b,float c){
        return a*b*c;
    }
    
    static double multiply(int arr[]){
        int result=1;
        for(int i=0;i<arr.length;i++){
            result *=arr[i];
        }
        return result;

    }

    static double multiply(int a,double b){
        return a*b;
    }
}

class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two int number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=MathOperation.multiply(a, b);
        System.out.println(c);

        System.out.println("Enter three float number");
        float i= sc.nextFloat();
        float j= sc.nextFloat();
        float m= sc.nextFloat();
        double k=MathOperation.multiply(i,j,m);
        System.out.println(k);

        System.out.println("Enter number element ");
        int n=sc.nextInt();
        System.out.println("Enter the int element");
        int ar[]= new int[n];
        for(int l=0;l<n;l++){
            ar[l]= sc.nextInt();
        }
        double aaa=MathOperation.multiply(ar);
        System.out.println(aaa);
        


        System.out.println("Enter two int number");
        int ab= sc.nextInt();
        double bc= sc.nextDouble();
        double cc=MathOperation.multiply(ab, bc);
        System.out.println(cc);

        sc.close();
    }
}