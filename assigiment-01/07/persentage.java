import java.util.Scanner;

class persentage 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark[] = new int[5];
        int sum=0; 
        System.out.println("Enter the marks of subject out of 100:");       
		for(int i=0;i<mark.length;i++){
			System.out.println("Enter marks");
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        float per=(sum*100)/(500);
        System.out.println("Pessentage is "+per+"  and total marks "+sum );
        sc.close();
    }
}