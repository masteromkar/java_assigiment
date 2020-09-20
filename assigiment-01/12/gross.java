import java.util.Scanner;

class gross{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Basic Salary:");
        float basic= scan.nextFloat();
        float hra,da,total;
        if(basic < 10000)
        {
            hra=(basic * 10)/100;
            da=(basic * 90)/100;
            total=basic + hra + da;
        }
        else{
            hra=2000;
            da=(basic * 98)/100;
            total=basic + hra + da;

        }
        System.out.println("Gross salary is "+total);
        scan.close();
    }
}