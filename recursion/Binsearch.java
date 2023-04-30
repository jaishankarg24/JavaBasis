package com.java1.basic.recursion;


public class Binsearch {
public static void main(String[] args) {
	int a[]={33,44,55,66,70,90};
	int in=binsec(a,70,0,a.length-1);
	if(in!=-1)
	{
		System.out.println("index : "+in );
		System.out.println("present");
	}
	else
		System.out.println("absent");
}

static int binsec(int a[], int ele, int low, int high)
{
	if(low<=high)
	{
		int mid=(low+high)/2;
		if(a[mid]==ele)
			return mid;
		if(a[mid]<ele)
			return binsec(a,ele,mid+1,high);
		else
			return binsec(a,ele,low,mid-1);
	}
	return -1;
}
}
