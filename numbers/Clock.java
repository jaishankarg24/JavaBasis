package com.java1.basic.javaprogm.numbers;class Clock
{
public static void main(String []args)
{
int hh=2;
int min=35;
double hangle=hh*30+min*0.5;
double mangle=min*6;
double angle=0.0;
if(hangle>mangle)
angle=hangle-mangle;
else
angle=mangle-hangle;
if(angle>180)
angle=360-angle;
System.out.println("least angle between"+hh+"and"+min+"is"+angle);
System.out.println("largest angle between"+hh+"and"+min+"is"+(360-angle));
}
}