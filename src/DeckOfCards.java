import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {

		
								
			String suit[] = {"hearts", "diamond", "spade", "club"};
			String faceValue[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "Ace"};
		
			
//			for(int i = 0; i< suit.length; i ++)
//				System.out.println(suit[i]);
//			
//			for(int i = 0; i< faceValue.length; i ++)
//				System.out.println(faceValue[i]);
			
//			Card card = new Card("spade", "1");
//			System.out.println();
			
			// instantiates an empty deck:
			List<Card> deck = new ArrayList<Card>();
			
			//  put 52 cards into deck
			public DeckOfCards() {
			for(int i = 0; i< suit.length; i++)
			{
				
				
				for(int j = 0; j< faceValue.length; j++)
				{
					Card c = new Card(suit[i], faceValue[j]); 
					deck.add(c);
					
					System.out.println(c.faceValue + " of " + c.suit);
				}
		
			}
			
			
		 }
	
	



}
