package BlackJack;
import java.util.*;

public class Card
{
	//Constructor
	public Card(String s, String fv) 
	{
		
		setFaceValue(fv);
		setSuit(s);
    }
	
	public static String suits[] = {"hearts", "diamonds", "spades", "clubs"};
	public static String faceValues[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "Ace"};

	private String suit;
	private String faceValue;
	private int numericValue;
	
	
	
	public String getFaceValue()
	{
			
		if (faceValue == null)
         {
             try {
				throw new Exception("The card does not exist");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
        
         return faceValue;
	}

	public void setFaceValue(String faceValue) 
	{
		for(int i = 0; i < faceValues.length; i++) 
		{
			if (faceValue == faceValues[i]) 
			{
				this.faceValue = faceValue;
				return;
			}
		}
		
        try
        {
			throw new Exception("Face value is invalid");
		} 
        catch (Exception e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	/*Gets the suit of the card
	 * @author Nicolette
	   @throws Lets you know card does not exist
	   @return gets the suit and checks if valid*/
	public String getSuit() 
	{
		
		if (suit == null)
        {
            try
            {
				throw new Exception("The card does not exist");
			} 
            catch (Exception e)
            {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		return suit;
		
	
	}

	public void setSuit(String suit)
	{		
		for(int i = 0; i < suits.length; i++)
		{
			if (suit == suits[i]) 
			{
				this.suit = suit;
				return;
			}
		}
		
	    try 
	    {
			throw new Exception("Suit is invalid");
		} 
	    catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	public int getNumericValue() 
	{
		int value = 0;
		switch (faceValue) 
		{
			case "2":
				value = 2;
				break;
			case "3":
				value = 3;
				break;
			case "4":
				value = 4;
				break;
			case "5":
				value = 5;
				break;
			case "6":
				value = 6;
				break;
			case "7":
				value = 7;
				break;
			case "8":
				value = 8;
				break;
			case "9":
				value = 9;
				break;
			case "10":
				value = 10;
				break;
			case "J":
			case "Q":
			case "K":
				value = 10;
				break;
			case "Ace":
				value = 11;
			
		}
		return value;
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faceValue == null) ? 0 : faceValue.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (faceValue == null) {
			if (other.faceValue != null)
				return false;
		} else if (!faceValue.equals(other.faceValue))
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return faceValue + " of " + suit;
	}
	
	
}
