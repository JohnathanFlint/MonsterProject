package monster.controller;

import monster.model.MarshmallowMonster;
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
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer .equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		System.out.println(firstMonster);
	}

}
