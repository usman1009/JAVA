import java.util.*;

class ov{
    public double area(double x){
        return Math.PI*x*x;
    }


    public double area(double x,double y){
        return x*y;
    }
}

public class overdemo{
    public static void main(String args[]){
        ov o = new ov();


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values:");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        


        
        System.out.println("area of circle:"+o.area(x));
        System.out.println("area of recta:"+o.area(x,y));
    }
}
