package monster.controller;

import monster.model.MarshmallowMonster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("ümlot the Destroyer of Languages! ", 1.5, 1, false, 2, 0, 5); //constructor call
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("This is my monster: " + firstMonster);
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
//		if (firstMonster.getEyeCount() > 3)
//		{
//			System.out.println("That's a lot of eyes!!!!!!!!!!! - Scary");
//		}
		
		monsterDecisions();
		loopMonster();
	}
		
		
		private void monsterDecisions()
		{
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer .equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("Fine, don't let me be happy. Gosh!");
		}
		System.out.println(firstMonster);
		
		int move = 0;
		while(move <= 10)
		{
			
		System.out.println("Jacob The Destroyer of Salt attacks you. What do you do?");
		String firstMove = keyboardInput.nextLine();
		if (firstMove .equalsIgnoreCase("Run"))
		{
			move++;
			System.out.println("The Destroyer of Salt throws his salt at you. What do you do?");			
			String firstRunMove = keyboardInput.nextLine();
			if (firstRunMove .equalsIgnoreCase("Dodge"))
			{
				System.out.println("The salt misses but explodes around you causing you to inhale it start screamin what and and go down choking. You are then eaten by Jacob.");
			}
			else if (firstRunMove .equalsIgnoreCase("Run faster"))
			{
				System.out.println("You feel the salt thump into your back causing you to stumble. You manage to keep running and escape but you are now eternally salty.");
			}			
		}
		else if(firstMove .equalsIgnoreCase("Fight"))
		{
			move++;
			System.out.println("You rush the monster causing it to roar and swipe at you. What do you do?");
			String firstFightMove = keyboardInput.nextLine();
			if (firstFightMove .equalsIgnoreCase("Dodge"))
			{
				move++;
				System.out.println("You narrowly dodge the strike and feel it graze your face leaving a trail of blood. You land next to a flute, sword, and crossbow what do you do?");
				String secondFightMove = keyboardInput.nextLine();
				List weaponList = Arrays.asList("grab sword", "grab flute", "grab crossbow");
				//if (secondFightMove )
				if(move == 2)
				{
					System.out.println("success");
				}
				else
				{
					System.out.println("failure");
				}	
			}
			}
				
		
		}
		}
		
		
		
					
	
	private void loopMonster()
	{
		for (int food = 0; food <= 10; food++)
		{
			System.out.print("HUNGRY!");
			while(food == 10)
			{
				System.out.println("FULL!");
				food++;
			}
		}
		System.out.println(firstMonster);
		//define variable for condition/test
		int numberOfTimes = 0;
		while(numberOfTimes < 1000)
		{
			System.out.print("Firstmonster words" + firstMonster);
			
			numberOfTimes++;
		}
		
		for(int count = 0; count < 1000; count++)
		{
			System.out.println("First monster words" + firstMonster);
		}
	}

}
