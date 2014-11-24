package irEngine;

import java.io.Serializable;
import java.util.LinkedList;

public abstract class GameCharacter implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8113054239150424408L;
	// Fields
	protected String firstName;
	protected String lastName;
	protected LinkedList<GameCharacter> acquaintances = new LinkedList<>();
	protected LinkedList<GameCharacter> friends = new LinkedList<>();
	protected Gender charaGender;
	protected Sex charaSex;
	
	public GameCharacter(String firstName, String lastName,
			 Gender charaGender, Sex charaSex)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.charaGender = charaGender;
		this.charaSex = charaSex;
	}
	
	public LinkedList<GameCharacter> getAcquaintances()
	{
		return acquaintances;
	}

	public LinkedList<GameCharacter> getFriends()
	{
		return friends;
	}

	public Sex getCharaSex()
	{
		return charaSex;
	}

	// Methods
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	public boolean addAcquaintance(GameCharacter gc)
	{
		return acquaintances.add(gc);
	}
	
	public boolean addFriend(GameCharacter gc)
	{
		return friends.add(gc);
	}
	
	public boolean acquaintanceToFriend(GameCharacter gc)
	{
		if (acquaintances.contains(gc) == false)
		{
			return false;
		}
		return friends.add(acquaintances.remove(acquaintances.indexOf(gc)));
		
	}
	
	public boolean friendToAcquaintance(GameCharacter gc)
	{
		if (friends.contains(gc) == false)
		{
			return false;
		}
		return acquaintances.add(friends.remove(acquaintances.indexOf(gc)));
	}
	
	public Gender getGender()
	{
		return charaGender;
	}

}
