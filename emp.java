import java.util.*;

class Employee{
    int eno;
    int salary;
    String name;

    public Employee(int eno,int salary,String name){
        this.eno=eno;
        this.salary=salary;
        this.name=name;
    }
    
}


public class emp{
    public static void main(String args[]){

        int i;
        int salary;
        int eno;
        String name;

        Scanner sc=new Scanner(System.in);

        Employee e[]= new Employee[20];

        System.out.println("enter the number of employees:");
        int n=sc.nextInt();



        for(i=0;i<n;i++){

            System.out.println("enter the employee no:");

            eno=sc.nextInt();

            System.out.println("enter the salary:");

            salary=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the employee name:");

            name=sc.nextLine();

            Employee e1 = new Employee(eno,salary,name);

            e[i] = e1;
        }

        System.out.println("enter the employee no you want to search:");
        eno=sc.nextInt();
        for(i=0;i<n;i++){
            if (e[i].eno == eno){
                System.out.println("name:"+e[i].name);
                System.out.println("salary:"+e[i].salary);

            }
        }

    }
}