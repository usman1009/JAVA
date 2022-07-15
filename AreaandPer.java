import java.util.*;

interface Shape{
    double area();
    double perimeter();
}


class Rectangle implements Shape{
    public double length;
    public double breadth;



    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length*breadth);
    }
}

class Circle implements Shape{
    public double radius;


    public Circle(double radius){
        this.radius=radius;
    }


    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
}


class AreaandPer{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter your choice:");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("enter the length of rect:");
            double length=sc.nextDouble();
            System.out.println("enter the breadth of rect:");
            double breadth=sc.nextDouble();

            Rectangle r1 = new Rectangle(length,breadth);

            System.out.println("area of the rectangle:"+r1.area());
            System.out.println("perimeter of the rectangle:"+r1.perimeter());
            break;
            
            
            case 2:
            System.out.println("enter the radius of circle:");
            double radius=sc.nextDouble();
            

            Circle c1 = new Circle(radius);

            System.out.println("area of the circle:"+c1.area());
            System.out.println("perimeter of the circle:"+c1.perimeter());
            break;


                
                
        
            default:
            System.out.println("enter the valid choice");
                
        

        }
    }
}
