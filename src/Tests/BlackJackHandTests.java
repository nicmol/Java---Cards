package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;

import BlackJack.Card;
import BlackJack.Hand;
import BlackJack.BlackJackHand;

public class BlackJackHandTests {

	@Test
	public void scoreTest() 
	{
		Card c1 = new Card("hearts", "5");
		Card c2 = new Card("hearts", "K");
		
		BlackJackHand hand = new BlackJackHand(c1, c2);
		
		
		int expected = 15;
		int actual = hand.score();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isBlackjackTest() 
	{
		Card c1 = new Card("spades", "J");
		Card c2 = new Card("hearts", "Ace");
		
		BlackJackHand hand = new BlackJackHand(c1, c2);
				
		boolean expected = true;
		boolean actual = hand.isBlackjack();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isBustedTest()
	{
		Card c1 = new Card("spades", "J");
		Card c2 = new Card("hearts", "Ace");
		Card c3 = new Card("diamonds", "9");
	
		BlackJackHand busted = new BlackJackHand(c1, c2);
		busted.addCard(c3);
		BlackJackHand notBusted = new BlackJackHand(c2, c3);
		
						
		boolean expected = true;
		boolean actual = busted.isBusted();
		assertEquals(expected, actual);
		
		expected = false;
		actual = notBusted.isBusted();
		assertEquals(expected, actual);
		
	}

}
