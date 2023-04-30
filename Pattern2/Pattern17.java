package com.java1.basic.javaprogm;public class Pattern17
{
public static void main(String[] args)
{
String st="AbibA";
for(int i=0;i<st.length(); i++)
{
for(int  j=0;j<st.length() ;j++)
{
if(i==0||i==st.length()-1)
System.out.print(st.charAt(j)+" ");
else if(j==0 || j==st.length()-1)
System.out.print(st.charAt(i)+" ");
else
System.out.print("  ");
}


System.out.println();
}
}
}