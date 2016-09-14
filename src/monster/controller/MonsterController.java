package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("ümlot the Destroyer of Languages! ", 1.5, 1, false, 2, 0, 5);
	}
	
	public void start()
	{
		System.out.println("This is my monster: " + firstMonster);
		
	}

}
