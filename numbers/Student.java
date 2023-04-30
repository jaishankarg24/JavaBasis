package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
class Student
{
public static void main(String []args)
{
Scanner rd=new Scanner(System.in);
System.out.println("enter the student id:");
int id=rd.nextInt();
System.out.println("enter the student name:");
String name=rd.next();
System.out.println("enter the 4 subjects marks:");
int m1=rd.nextInt();
int m2=rd.nextInt();
int m3=rd.nextInt();
int m4=rd.nextInt();
double per=(m1+m2+m3+m4)/4.0;

System.out.println("student id:"+id);
System.out.println("student name:"+name);
System.out.println("marks:"+m1+" "+m2+" "+m3+" "+m4);
System.out.println("percentage:"+per);

if(m1>=35&&m2>=35&&m3>=35&&m4>=35)
System.out.println("pass");
else
System.out.println("fail");
}
}