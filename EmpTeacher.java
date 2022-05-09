import java.util.Scanner;

class Employee{

int EmpId;
String name;
String address;
Employee(int x,String y,String z){
this.EmpId=x;
this.name=y;
this.address=z;
}
}



class Teacher extends Employee{
String department;
String subject;
Teacher(String department,String subject,int EmpId,String name,String address){
super(EmpId,name,address);
this.department=department;
this.subject=subject;
}

void display(){
    System.out.println("EMPID="+EmpId+ "  " + " EMPLOYEE NAME="+name + " " + " ADDRESS:"+address+ " "+ "DEPARTMENT="+department+" " + "SUBJECT="+subject+ " ");
    System.out.println();
    }
}




public class EmpTeacher{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Teacher[] obj = new Teacher[4];
obj[0] = new Teacher("C.S","OS",123,"ASHHAD","ABC");
obj[1] = new Teacher("CHEMISTRY","ORGANIC CHEMISTRY",234,"SACHIN","DEF");
obj[2] = new Teacher("PHYSICS","COMPLIMENTARY PHYSICS",546,"ABHINAND","GHI");
obj[3] = new Teacher("C.S","ADBMS",876,"HAMRAS","JKL");

System.out.println("THE DETAILS OF TEACHERS:");
System.out.println();

obj[0].display();
obj[1].display();
obj[2].display();
obj[3].display();
}
}

