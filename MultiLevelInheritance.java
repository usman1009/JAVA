import java.util.Scanner;

class Person{

String name;
String gender;
String address;
int age;
Person(String x,String y,String z,int a){
this.name=x;
this.gender=y;
this.address=z;
this.age=a;
}
}



class Employee extends Person{
int empid;
String compname;
String Qualification;
String salary;
Employee(int empid,String compname,String Qualification,String salary,String name,String gender,String address,int age){
super(name,gender,address,age);
this.empid=empid;
this.compname=compname;
this.Qualification=Qualification;
this.salary=salary;
}
}







class Teacher extends Employee{
int teacherid;
String subject;
String department;
Teacher(int teacherid,String subject,String department,int empid,String compname,String Qualification,String salary,String name,String gender,String address,int age){
super(empid,compname,Qualification,salary,name,gender,address,age);
this.teacherid=teacherid;
this.subject=subject;
this.department=department;
}


void display(){
    System.out.println("TEACHER ID:"+teacherid+" "+"SUBJECT:"+subject+" "+"DEPARTMENT:"+department+" "+"EMPID="+empid+ " "+"COMPANY NAME="+compname + " " + "QUALIFICATION:"+Qualification+ " "+ "SALARY:"+salary+" " + "NAME:"+name+ " "+"GENDER:"+gender+" "+"ADDRESS:"+address+" "+"AGE:"+age+" ");
    System.out.println();
    }
}




public class MultiLevelInheritance{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Teacher[] obj = new Teacher[2];
obj[0] = new Teacher(11,"OS","CS",110,"ABCD","MCA","50000","ASHHAD","MALE","ASHHAD KOZHIKODE",24);
obj[1] = new Teacher(12,"ORGANIC CHEMISTRY","CHEMISTRY",120,"XYZ","M.Sc","50000","ABHINAND","MALE","ABHINAND KOZHIKODE",24);

System.out.println("THE DETAILS OF TEACHERS:");
System.out.println();

obj[0].display();
obj[1].display();
}
}

