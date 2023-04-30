package com.java1.basic.javaprogm.numbers;
public class Decto
{
public static void main(String[] args)
{


String rs=convert(98,16);
System.out.println(rs);

}

static String convert(int dec, int b)
{
String con="";
while(dec>0)
{
int r=dec%b;
if(r>9)
con=(char)(r+55)+con;
else
con=r+con;
dec=dec/b;
}
return con;
}
}