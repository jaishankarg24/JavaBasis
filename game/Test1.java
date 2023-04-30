package com.java1.basic.game;

public class Test1 {
	public static void main(String[] args)
	{
		System.out.println("app start");
		Option o=new Option();
		Weapons w=o.select(); //upcasting

		if(w instanceof Gun)
		{
			Gun g=(Gun)w;  //downcasting
			g.shoot();
		}
		else  if(w instanceof Bomb)
		{
			Bomb bm=(Bomb)w;  //downcasting
			bm.blast();
		}
		else
		{
			Knife k=(Knife)w;  //downcasting
			k.stab();
		}
		System.out.println("app end");
	}

}
