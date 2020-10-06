import java.util.Scanner;



class Person{
    int age=18;
    String name;
    Person(int a,String b){
        this.age=a;
        this.name=b;
    }
    void display(){
        System.out.println("Age of "+this.name+" is "+this.age);
    }
}

class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int a= sc.nextInt();
        System.out.println("Enter the name");
        String b =sc.next();
        Person p= new Person(a,b);
        p.display();
        sc.close();
    }
}