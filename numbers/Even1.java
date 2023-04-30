package com.java1.basic.javaprogm.numbers;import java.util.Scanner;
public class Even1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 4 no");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
int w=sc.nextInt();

Even1 e1=new Even1();
int nd=e1.getEven(x);

System.out.println(x +"has"+nd+"digits");
System.out.println(y +"has"+e1.getEven(y)+"digits");
System.out.println(z +"has"+e1.getEven(z)+"digits");

System.out.println(w +"has"+e1.getEven(w)+"digits");

}

int getEven(int n)
{
int c=0;
do
{
int r=n%10;
if(r%2==0)
c++;
n=n/10;
}
while(n!=0);

return c;
}


}
