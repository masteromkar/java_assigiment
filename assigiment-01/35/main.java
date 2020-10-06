import java.util.Scanner;

class MathOperation{
    static int add(int a,int b){
        return a+b;
    }

    static int subtract(int a,int b){
        return a-b;
    }

    static int multiply(int a,int b){
        return a*b;
    }
    
    static long power(int a,int b){
        long result = 1;

        while (b != 0)
        {
            result *= a;
            --b;
        }
        return result;
    }



}
class Demo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= MathOperation.add(a,b);
        System.out.println(sum);
        int sub= MathOperation.subtract(a,b);
        System.out.println(sub);
        int mul= MathOperation.multiply(a,b);
        System.out.println(mul);
        long pow= MathOperation.power(a,b);
        System.out.println(pow);    
        sc.close();
    }
}