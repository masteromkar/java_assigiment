import java.util.Scanner;

class Student{
    int rno;
    String name;
    void setData(int r,String n){
        rno=r;
        name=n;
    }
    void show(){
        System.out.println("Rollnumber "+rno+" name "+name);
    }
    
}

class StudentDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number");
        int roll= sc.nextInt();
        System.out.println("Enter the name");
        String name = sc.next();
        Student s = new Student();
        s.setData(roll, name);
        s.show();
        sc.close();
        
    }
}