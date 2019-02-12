package BlackJack;

import java.util.*;

public class CardApp 
{
	 public static DeckOfCards d = new DeckOfCards();

	 public static BlackJackHand userHand = new BlackJackHand(d.drawCard(), d.drawCard());
	 public static BlackJackHand dealerHand = new BlackJackHand(d.drawCard(), d.drawCard());
	
	 public static void main(String[] args) 
	 {	
		 
		
		Boolean isWinner = false;
		 
		 
		 start();
		 
		 printHands();
		
		 
		while(!isWinner) 
		{
			if (userHand.score() < 21) 
			{
													
				Scanner scan = new Scanner(System.in);
				System.out.println("Stay or Hit? Type: S/H");
				String userEntered = scan.next();
				
				if (userEntered.equals("S")) 
				{
					if(dealerHand.score() < 17) 
					{
						Card newCard = d.drawCard();
						dealerHand.addCard(newCard);
					}
					else 
					{
						if(userHand.score() > dealerHand.score())
						{
							System.out.println("You Win!");
							isWinner = true;
						}
						else if(userHand.score() < dealerHand.score())
						{
							System.out.println("Dealer Wins!");
							isWinner = true;
						}
						else 
						{
							System.out.println("No Winner...");
							isWinner = true;
						}
						break;
					}
						
				}
				
				if (userEntered.equals("H"))
				{
					Card newCard = d.drawCard();
					userHand.addCard(newCard);
				}
			}
	
			//Player Move
			if (userHand.isBusted())
			{
				System.out.println("Your bust!");
				isWinner = true;
				break;
			}
			
			if (userHand.isBlackjack())
			{
				System.out.println("BlackJack! You win!");
				isWinner = true;
				break;
			}
			
			if(dealerHand.isBusted()) 
			{
				System.out.println("Dealer is bust! You win!");
				isWinner = true;
				break;
			}
			
			if(dealerHand.isBlackjack()) 
			{
				System.out.println("Dealer has BlackJack! You Lose!");
				isWinner = true;
				break;
			}
			
		printHands();
		 
	}
	 
	printHands();
 }	 
	
		 
	public static void start()
	{
		System.out.println("Let's play BlackJack!");
		System.out.println();
	}

	public static void printHands()
	{
		System.out.println("Player Hand:");
		System.out.println(userHand.toString());
		System.out.println();
		System.out.println("Dealer Hand:");
		System.out.println(dealerHand.toString());
	}
}

	


				
	

