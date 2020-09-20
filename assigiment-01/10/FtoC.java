import java.util.Scanner;

class FtoC{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the temperatuer in fahrenheit");
        double ft= sc.nextDouble();
        Double ct=((ft-32)*5)/9;
        System.out.println("Temperture in Fahrenheit "+ft+" is "+ct+" Celsius");
        sc.close();
    }
}