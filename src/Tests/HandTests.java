package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import BlackJack.BlackJackHand;
import BlackJack.Card;
import BlackJack.Hand;

public class HandTests {

	@Test
	public void addCardTest()
	{
		Card c1 = new Card("hearts", "5");
		Card c2 = new Card("hearts", "K");
		Card c3 = new Card("hearts", "Q");
		
		BlackJackHand hand = new BlackJackHand(c1, c2);
		
		int expected = 2;
		int actual = hand.count();
		assertEquals(expected, actual);
		
		hand.addCard(c3);
		
		expected = 3;
		actual = hand.count();
		assertEquals(expected, actual);
	}
	
	@Test
	public void countTest()
	{
		Card c1 = new Card("hearts", "5");
		Hand h1 = new Hand();
		assertEquals(0, h1.count());
		
		h1.addCard(c1);
		assertEquals(1, h1.count());
		
		h1.addCard(c1);
		assertEquals(2, h1.count());
	}
	
	@Test
	public void hasCardTest()
	{
		Card c1 = new Card("hearts", "5");
		Card c2 = new Card("hearts", "K");
		Card c3 = new Card("hearts", "Q");
		Card c4 = new Card("hearts", "Q");
		Hand h1 = new Hand();
		h1.addCard(c1);
		h1.addCard(c2);
		
		assertEquals(false, h1.hasCard(c4));
		h1.addCard(c3);
		
		assertEquals(true, h1.hasCard(c4));
	}

	@Test
	public void getCardByIndexTest()
	{
		Card c1 = new Card("hearts", "5");
		Card c2 = new Card("hearts", "K");
		Card c3 = new Card("hearts", "Q");
		
		Hand h1 = new Hand();
		h1.addCard(c1);
		h1.addCard(c2);
		h1.addCard(c3);
		Card c4 = h1.getCardByIndex(2);
		
		boolean expected = true;
		boolean actual = c4.equals(c3);
	}
	
	
}
