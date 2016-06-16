package main;

public class Main {
	public static void main(String[] args){
		System.out.println("Initializing deck");
		Deck deck = new Deck();
		System.out.println("Deck Initialized Successfully");

		System.out.println("\n**********************************\n");
		System.out.println("Testing Deck Shuffle");
		System.out.println("Deck Before Shuffling");
		deck.printDeck();
		System.out.println("Deck After Shuffling");
		deck.shuffleDeck();
		deck.printDeck();
		
		System.out.println("\n**********************************\n");
		System.out.println("Testing Deck Cut");
		System.out.println("Deck Before Cut");
		deck.printDeck();
		System.out.println("Deck After Shuffling");
		deck.cutDeck(13);
		deck.printDeck();
		
		System.out.println("\n**********************************\n");
		System.out.println("Testing Deck Deal");
		System.out.println("Deck Before Deal");
		deck.printDeck();
		Card c = deck.dealDeck();
		System.out.println("Top Card of deck : " + c.getSuit() + " " + c.getValue() );
		System.out.println("Deck After Deal");
		deck.printDeck();
		
		System.out.println("\n**********************************\n");
		System.out.println("Testing Deck Search");
		System.out.println("Deck Before Search");
		deck.printDeck();
		c = new Card ("Heart", "Ace");
		int pos = deck.cardPosDeck(c);
		System.out.println("Card position : " + pos);
		System.out.println("Deck After Search");
		deck.printDeck();
		
		System.out.println("\n**********************************\n");
		System.out.println("Testing Deck Turn Over");
		System.out.println("Deck Before Turn Over");
		deck = new Deck();
		deck.shuffleDeck();
		deck.printDeck();
		c = deck.turnOverDeck();
		System.out.println("Top Card of deck : " + c.getSuit() + " " + c.getValue() );
		System.out.println("Deck After Turn Over");
		deck.printDeck();
				
		System.out.println("\n**********************************\n");
		System.out.println("Testing Deck Sorting");
		System.out.println("Deck Before Sorting");
		deck.printDeck();
		System.out.println("Deck After Sorting");
		deck.sortDeck();
		deck.printDeck();
		
	}
}
