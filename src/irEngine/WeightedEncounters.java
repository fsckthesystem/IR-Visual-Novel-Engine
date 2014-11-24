package irEngine;

import java.io.Serializable;

public class WeightedEncounters implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4864379743509415644L;
	
	// Fields
	private int encounters;
	private int encountersWeight;
	
	// Constructors
	public WeightedEncounters()
	{
		encounters = 0;
		encountersWeight = 0;
	}
	
	public WeightedEncounters(int encounters, int encountersWeight)
	{
		this.encounters = encounters;
		this.encountersWeight = encountersWeight;
	}
	
	// Methods
	public int getEncounters()
	{
		return encounters;
	}
	
	public int getEncounterWeight()
	{
		return encountersWeight;
	} 
	
	public boolean addEncounter()
	{
		try
		{
			encounters++;
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean addEncounter(int weight)
	{
		if (weight < 0)
		{
			return false;
		} 
		encountersWeight += weight; 
		encounters++;
		return true;
	}
}
