package BlackJack;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {

		
			
			
			
			// instantiates an empty deck:
			List<Card> deck = new ArrayList<Card>();
			
			//  put 52 cards into deck
			public DeckOfCards() {
			for(int i = 0; i< Card.suits.length; i++)
			{
				
				
				for(int j = 0; j< Card.faceValues.length; j++)
				{
					Card c = new Card(Card.suits[i], Card.faceValues[j]); 
					deck.add(c);
					
					
				}
		
			}
			
			
		 }
			//draws a card at a random index
			public Card drawCard() {
				int index = 0;
				Random random = new Random();
				index = random.nextInt(this.deck.size());
				Card card = deck.get(index);
				deck.remove(index);
				return card;			
				}
			
			//draws a card at a specific index
			public Card drawCard(int index) {
				
				Card card = deck.get(index);
				deck.remove(index);
				return card;
				
			}
			
			@Override
			public String toString() {
			
				String output = "";
								
				for(Card c : deck)
		           {
		             output += c.toString() + "\n";
		           }

		           return output;
				
			}
			
	
	
	
}
