package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Hand{

	public  Hand() {}
			
	// instantiates an empty deck:
	List<Card> hand = new ArrayList<Card>();
		
	
	public void addCard(Card newCard)
	{
		hand.add(newCard);
	}
	
	public int count()
	{
		return hand.size();
	}


	public boolean hasCard(Card c)
    {
		for(int i = 0; i<this.count(); i++)
        {
			if(c.equals(this.getCardByIndex(i)))
        	{
				return true;
        	}        	 
        }
        return false;         
    }

	public Card getCardByIndex(int value) {
		
		return hand.get(value);
	}

	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}

}
