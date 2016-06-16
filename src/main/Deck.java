package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Deck {
	private LinkedList<Card> deck_of_card = new LinkedList<Card>();
	List<String> suit = new ArrayList<String>();
	List<String> value = new ArrayList<String>();
	
	public Deck() {

		suit.add("Heart");
		suit.add("Club");
		suit.add("Diamond");
		suit.add("Spade");

		value.add("Ace");
		value.add("2");
		value.add("3");
		value.add("4");
		value.add("5");
		value.add("6");
		value.add("7");
		value.add("8");
		value.add("9");
		value.add("10");
		value.add("Jack");
		value.add("Queen");
		value.add("King");
		
		for (String s : suit){
			for(String v : value){
				Card c = new Card (s,v);
				this.deck_of_card.addFirst(c);
			}
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(deck_of_card);
	}
	
	public void cutDeck(int position){
		for (int i = 1;i<=position;i++){
			this.deck_of_card.add(this.deck_of_card.pop());
		}
	}
	
	public Card dealDeck(){
		return this.deck_of_card.pop();
	}
	
	public Card turnOverDeck(){
		return this.deck_of_card.peek();
	}
	
	public int cardPosDeck(Card c_search){
		ListIterator<Card> listIterator = this.deck_of_card.listIterator();
		int count = 1;
        while (listIterator.hasNext()) {
        	Card c = listIterator.next();
            if ((c.getSuit().equals(c_search.getSuit())) && (c.getValue().equals(c_search.getValue()))){
            	return count;
            }
            count++;
        }
		return -1;
	}
	
	public void sortDeck(){
		Collections.sort(this.deck_of_card);
	}
	
	public void printDeck(){
		int count = 1;
		ListIterator<Card> listIterator = this.deck_of_card.listIterator();
		System.out.println("\nDeck Size : " + this.deck_of_card.size());
        while (listIterator.hasNext()) {
        	Card c = listIterator.next();
            System.out.println(count++ + " : " + c.getSuit() +  " " + c.getValue());
        }
	}
}
