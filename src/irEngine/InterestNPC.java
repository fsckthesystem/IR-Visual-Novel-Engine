package irEngine;

import java.io.Serializable;
import java.util.LinkedList;

public class InterestNPC extends NPCs implements Serializable
{

	public InterestNPC(String firstName, String lastName,
			Gender charaGender, Sex charaSex, int age,
			boolean crushing, boolean angry, boolean sad,boolean embarrassed, int willingLevel, int trustLevel, int interestLevel)
	{
		super(firstName, lastName, charaGender, charaSex, age);
		this.crushing = crushing;
		this.angry = angry;
		this.sad = sad;
		this.embarrassed = embarrassed;
		this.willingLevel = willingLevel;
		this.trustLevel = trustLevel;
		this.interestLevel = interestLevel;

	}
	// Fields
	protected boolean crushing;
	protected boolean angry;
	protected boolean sad;
	protected boolean embarrassed;
	protected int willingLevel;
	protected int trustLevel;
	protected int interestLevel;
	
	// methods
	
	public boolean increaseWillingLevel(int i)
	{
		if (this.willingLevel >= 100)
		{
			// willing level is at max (100)
			return false;
		}
		this.willingLevel += i;
		if (this.willingLevel > 100)
			this.willingLevel = 100;
		return true;
	}
	
	public boolean decreaseWillingLevel(int i)
	{
		if (this.willingLevel <= 0)
		{
			// willing level is at min (0)
			return false;
		}
		this.willingLevel -= i;
		if (this.willingLevel < 0)
			this.willingLevel = 0;
		return true;
	}
	
	public boolean increaseTrustLevel(int i)
	{
		if (this.trustLevel >= 100)
		{
			// trust level is at max (100)
			return false;
		}
		this.trustLevel += i;
		if (this.trustLevel > 100)
			this.trustLevel = 100;
		return true;
	}
	
	public boolean decreaseTrustLevel(int i)
	{
		if (this.trustLevel <= 0)
		{
			// trust level is at min (0)
			return false;
		}
		this.trustLevel -= i;
		if (this.trustLevel < 0)
			this.trustLevel = 0;
		return true;
	}
	
	public boolean increaseInterestLevel(int i)
	{
		if (this.interestLevel >= 100)
		{
			//interest level at max (100)
			return false;
		}
		this.interestLevel += i;
		if (this.interestLevel > 100)
			this.interestLevel = 100;
		return true;
	}
	
	public boolean decreaseInterestLevel(int i)
	{
		if (this.interestLevel <= 0)
		{
			//interest level at min (0)
			return false;
		}
		this.interestLevel -= i;
		if (this.interestLevel < 0)
			this.interestLevel = 0;
		return true;
	}
	
	public boolean setCrushing(boolean b)
	{
		this.crushing = b;
		return true;
	}
	
	public boolean setAngry(boolean b)
	{
		this.angry = b;
		return true;
	}
	
	public boolean setSad(boolean b)
	{
		this.sad = b;
		return true;
	}
	
	public boolean setEmbarrassed(boolean b)
	{
		this.embarrassed = b;
		return true;
	}
}
