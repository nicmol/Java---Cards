package Tests;
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

import BlackJack.Card;


public class CardTests {

	
	@Test
	public void toStringTest() {
		
		Card c1 = new Card("hearts", "5");
		String expected = "5 of hearts";
		assertEquals(expected, c1.toString());
	}	
		
	

		@Test
		public void setFaceValueValidTest()
		{
			Card c = new Card("spades", "2");
			c.setFaceValue("Ace");
			assertEquals("Ace", c.getFaceValue());

		}
		
		@Test
		public void setFaceValueInvalidTest()
		{
			Card c = new Card("spades", "20");
			assertNotEquals("20", c.getFaceValue());
			assertEquals(null, c.getFaceValue());
			
		}
		
		@Test
		public void setSuitValidTest()
		{
			Card c = new Card("spades", "2");
			c.setSuit("hearts");
			assertEquals("hearts", c.getSuit());

		}
		
		@Test
		public void setSuitInvalidTest()
		{
			Card c = new Card("squares", "2");
			assertNotEquals("squares", c.getSuit());
			assertEquals(null, c.getSuit());
			
		}
		
		@Test
		public void getNumericValueTest()
		{
			Card c = new Card("clubs", "K");
			assertEquals(10, c.getNumericValue());
			
			c.setFaceValue("Ace");
			assertEquals(11, c.getNumericValue());
			
		}
		
		
	}
	
	


