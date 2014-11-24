package irEngine;

import java.io.Serializable;
import java.util.LinkedList;

public abstract class NPCs extends GameCharacter implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9046668106026401170L;
	// Fields
	protected int age;
	protected WeightedEncounters goodEncountersWithProtagonist = new WeightedEncounters();
	protected WeightedEncounters badEncountersWithProtagonist = new WeightedEncounters();
	
	public NPCs(String firstName, String lastName, Gender charaGender, 
			Sex charaSex, int age)
	{
		super(firstName, lastName, charaGender, charaSex);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	
	// Methods
	public int getAge()
	{
		return age;
	}
	
	public boolean addGoodEncounter(int weight)
	{
		if (weight < 0)
		{
			return false;
		}
		return goodEncountersWithProtagonist.addEncounter(weight);
	}

	public boolean addBadEncounter(int weight)
	{
		if (weight < 0)
		{
			return false;
		}
		return badEncountersWithProtagonist.addEncounter(weight);
	}
	
	public int getGoodEncounters()
	{
		return goodEncountersWithProtagonist.getEncounters();
	}
	
	public int getBadEncounters()
	{
		return badEncountersWithProtagonist.getEncounters();
	}
	
	public int getGoodEncounterWeight()
	{
		return goodEncountersWithProtagonist.getEncounterWeight();
	}
	
	public int getBadEncounterWeight()
	{
		return badEncountersWithProtagonist.getEncounterWeight();
	}
}
