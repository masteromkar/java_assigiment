class Employee{
    static int empNo;
    float salary;
    static double totalSalary;

    Employee(Float sal){
        empNo=empNo+1;
        this.salary=sal;
        totalSalary=totalSalary+sal;
    }

    void display(){
        System.out.println(" Total Employee "+empNo+" Total Salary "+totalSalary);
    }
}
class demo{
    public static void main(String[] args) {
        Employee a= new Employee(1f);
        a.display();
        Employee b= new Employee(1f);
        b.display();
        Employee c= new Employee(1f);
        c.display();
        Employee d= new Employee(1f);
        d.display();
        Employee e= new Employee(1f);
        e.display();
        Employee f= new Employee(1f);
        f.display();
        Employee g= new Employee(1f);
        g.display();
    }
}