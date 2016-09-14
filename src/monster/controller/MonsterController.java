package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Umlot the Destroyer of Languages", 0.5, 1, false, 2, 0, 5);
	}
	
	public void start()
	{
		System.out.println("My monster is here to destroy your language!" + firstMonster);
		
	}

}
