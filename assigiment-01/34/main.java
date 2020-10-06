import java.util.Scanner;

class circle{
    float radius;
    double area;
    void init(float r){
        this.radius=r;
    }
    void areaCircle(){
        this.area=(3.14*radius*radius);
    }

    void display(){
        System.out.println("Area of circle "+area);
    }
}

class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius ");
        float a= sc.nextFloat();
        circle c = new circle();
        c.init(a);
        c.areaCircle();
        c.display();
        sc.close();
    }
}