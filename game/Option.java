package com.java1.basic.game;
import java.util.Random;

public class Option {


	Weapons select()
	{
		Random r=new Random();
		int rn=r.nextInt(3);

		if(rn==0)
		{
			return new Bomb();
		}
		else if(rn==1)
		{
			return new Gun();
		}
		else
		{
			return new Knife();
		}
	}

}
