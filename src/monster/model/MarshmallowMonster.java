package monster.model;

public class MarshmallowMonster 
{

	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	private int legCount;

	public MarshmallowMonster() {
		this.name = "no name here";
		this.antennaCount = -654654;
		this.eyeCount = -634146;
		this.hasBellyButton = false;
		this.armCount = -213;
		this.noseCount = -89987;
		this.legCount = -6345;
	}

	public MarshmallowMonster(String name, double antennaCount, int eyeCount,
			boolean hasBellyButton, int armCount, int noseCount, int legCount) 
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount; 
		this.legCount = legCount;
	}
	
	
	
	public String toString()
	{
		String description = "Name is " + this.name;
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public int getLegCoount()
	{
		return legCount;
	}
}



/* ümlot the Destroyer of Languages
	antenna 1
	eyes 0
	belly button 0
	arms 2
	nose 0
	legs 5*/