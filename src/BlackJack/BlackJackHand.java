package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand{
	
	
			
	public BlackJackHand(Card card1, Card card2)
	{
		hand.add(card1);
		hand.add(card2);
	}
	
    public int score()
	{
		             
        int score = 0;
        for (int i = 0; i < hand.size(); i++)
        {
            score = score + hand.get(i).getNumericValue();
        }
        return score;
    }
	
	public boolean isBlackjack()
	{
		        
		if (this.score() == 21)
		{
			return true;
		}
		return false;

	}
	
	
	public boolean isBusted() 
	{
		if (this.score() > 21)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
	
		String output = "";
						
		for(Card c : hand)
           {
             output += c.toString() + "\n";
           }

           return output;
		
	}

	
}