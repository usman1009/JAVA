import java.util.*;
class MyException extends Exception{

    public MyException(String msg){
    super(msg);
}
}



public class negno{

    public static void main(String args[]){

        int num,i=0,temp=0;
        double average,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("how many numbers you want to enter:");

    int n= sc.nextInt();

    System.out.println("enter" + n + "numbers:");

    for(i=0;i<n;i++){
        try{
            num=sc.nextInt();
            
            if (num<0){
                throw new MyException("negative number");
            }


            temp++;
            sum=sum+num;


        }catch(MyException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }

     average=sum/temp;
     System.out.println("average:"+average);
    }
}