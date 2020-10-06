import java.util.Scanner;
class add{
    int a;
    int b;
    int c;
    void set(int a1,int b1){
        a=a1;
        b=b1;
        this.addNum();
    }
    void addNum(){
        c=this.a+this.b;
        this.Show();
    }
    void Show(){
        System.out.println("after add "+c);
    }
}

class b{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        add s= new add();
        s.set(a,b);
        sc.close(); 
    }
}