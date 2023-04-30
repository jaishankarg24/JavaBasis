package com.java1.basic.javaprogm.numbers;
import java.util.Scanner;
public class Count1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 4 no");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int w=sc.nextInt();

Count1 d1=new Count1();
int nd=d1.getCount(x);

System.out.println(x +"has"+nd+"digits");
System.out.println(y +"has"+d1.getCount(y)+"digits");
System.out.println(z+"has"+d1.getCount(z)+"digits");

System.out.println(w +"has"+d1.getCount(w)+"digits");

}

int getCount(int n)
{
int c=0;
do
{
c++;
n=n/10;
}
while(n!=0);

return c;
}


}
