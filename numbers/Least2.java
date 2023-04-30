package com.java1.basic.javaprogm.numbers;class Least2
{
int getleast(int a,int b)
{
if(a<=b)
return a;
else 
return b;

}

public static void main(String[] args)
{
Least2 l=new Least2();
int least=l.getleast(100,35);
System.out.println("least value is:"+least);


}
}